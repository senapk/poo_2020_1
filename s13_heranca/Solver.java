import java.util.*;

abstract class Pet{ //Class base, classe pai, superclasse
    String name;
    public Pet(String nome){
        this.name = nome;
    }
    abstract public String fazerBarulho();
    abstract public boolean isAlive();
    abstract public void manutencao();
    abstract public void interagir(Pet other);
    public String toString(){
        return name;
    }
}

class GatoDomestico extends Pet{
    private int fofura;
    public GatoDomestico(String name, int fofura){
        super(name);
        this.fofura = fofura;
    }
    public String fazerBarulho(){
        String saida = "Mi";
        for(int i = 0; i < fofura; i++)
            saida += "a";
        return saida + "u";
    }
    public boolean isAlive(){
        return true;
    }
    public void manutencao(){
        this.fofura += 1;
    }
    public String toString(){
        return super.toString() + ":" + fazerBarulho();
    }
    public void interagir(Pet other){
        if(other instanceof GatoDeRua)
            this.fofura = -100;
        else
            this.fofura *= 2;
    }
}

class GatoDeRua extends Pet{//classe derivada, classe filha, subclasse
    boolean alive;
    int vidas;
    public GatoDeRua(){
        super("gato");
        vidas = 7;
        alive = true;
    }
    public String fazerBarulho() {
        if(!this.isAlive())
            return "...";
        else
            return "miau";
    }
    public void brigarNoTelhado(){
        Random gerador = new Random();
        if(gerador.nextInt() % 10 == 0){
            if(this.vidas > 0)
                this.vidas -= 1;
            if(this.vidas == 0)
                this.alive = false;
        }
    }
    public boolean isAlive(){
        return alive;
    }
    public void manutencao(){
        for(int i = 0; i < 30; i++)
            brigarNoTelhado();
    }
    public String toString(){
        return super.toString() + ":" + vidas + ":" + fazerBarulho();
    }

    public void interagir(Pet other) {
        if(other instanceof GatoDomestico)
            this.vidas = 7;
    }
    
}

class Petolandia{
    Map<Integer, Pet> animais;
    int nextId;
    Random gerador;
    Petolandia(){
        this.animais = new TreeMap<Integer, Pet>();
        this.nextId = 0;
        this.gerador = new Random();
    }

    public void addPet(Pet pet){
        this.animais.put(nextId, pet);
        nextId += 1;
    }

    void manutencaoMensal(){

        for(Pet pet : animais.values())
            pet.manutencao();
        ArrayList<Pet> lista = new ArrayList<Pet>(animais.values());
        for(int i = 0; i < (lista.size() / 2); i++){
            Pet one = lista.get(gerador.nextInt(lista.size()));
            Pet two = lista.get(gerador.nextInt(lista.size()));
            if(one != two){
                one.interagir(two);
                two.interagir(one);
            }
        }
    }

    void limpar(){
        ArrayList<Integer> estaoMortos = new ArrayList<>();

        for(Map.Entry<Integer, Pet> pair : this.animais.entrySet())
            if(!pair.getValue().isAlive())
                estaoMortos.add(pair.getKey());

        for(Integer key : estaoMortos)
            animais.remove(key);
    }

    public String toString(){
        String saida = ""; 
        for(Map.Entry<Integer, Pet> pair : this.animais.entrySet())
            saida += pair.getKey() + ":" + pair.getValue() + "\n";
        return saida + "\n---------------------------\n";
    }
}

public class Solver{
    public static void main(String[] args) {
        Petolandia land = new Petolandia();
        land.addPet(new GatoDomestico("Pikachu", 1));
        land.addPet(new GatoDomestico("Bubasauro", 4));
        land.addPet(new GatoDeRua());
        land.addPet(new GatoDeRua());
        land.addPet(new GatoDeRua());
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")){
                break;
            }else if(line.equals("s")){
                System.out.println(land);
            }else if(line.equals("m")){
                land.manutencaoMensal();
                System.out.println(land);
            }else if(line.equals("l")){
                land.limpar();
                System.out.println(land);
            }
        }
        scanner.close();
    }
}