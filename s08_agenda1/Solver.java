import java.util.ArrayList;
import java.util.Scanner;

class Fone{
    public String id;
    public String number; //atributos definem o estado
    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return id + ":" + number;
    }

    public static boolean validar(String number){
        String validos = "0123456789().-";
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            if(validos.indexOf(c) == -1)
                return false;
        }
        return true;
    }
}

class Contato{
    private String name;
    private ArrayList<Fone> fones; //composição

    public Contato(String name){
        this.name = name;
        fones = new ArrayList<>(); //array sem telefones
    }
    
    public String getName(){
        return name;
    }

    public String toString(){
        String saida = "- " + this.name;
        if(fones.size() > 0)
            saida += " ";
        for(int i = 0; i < fones.size(); i++){
            Fone fone = fones.get(i);
            saida += "[" + i + ":" +  fone + "]";
        }
        return saida;
    }

    public void addFone(String id, String number){ //composicao
        if(Fone.validar(number))
            fones.add(new Fone(id, number));
        else
            System.out.println("fail: fone invalido");
    }

    public void rmFone(int indice){
        if(indice < 0 || indice >= fones.size())
            return;
        fones.remove(indice);
    }
}


public class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contato contato = new Contato("");
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }
            else if(ui[0].equals("init")){
                contato = new Contato(ui[1]);
            }
            else if(ui[0].equals("add")){
                contato.addFone(ui[1], ui[2]);
            }
            else if(ui[0].equals("rm")){
                contato.rmFone(Integer.parseInt(ui[1]));
            }
            else if(ui[0].equals("show")){
                System.out.println(contato);
            }
            else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}