import java.util.Scanner;
import java.util.ArrayList;

class Cliente{
    public String id;
    public String fone;
    public Cliente(String id, String fone){
        this.id = id;
        this.fone = fone;
    }
    public String toString(){
        return id + ":" + fone;
    }
}

class Sala{
    private ArrayList<Cliente> cadeiras;

    public Sala(int lotacao){
        cadeiras = new ArrayList<Cliente>();
        for(int i = 0; i < lotacao; i++)
            cadeiras.add(null);
    }
    public int getLotacao(){
        return cadeiras.size();
    }

    public boolean reservar(String id, String fone, int indice){
        if(indice < 0 || indice >= this.getLotacao()){
            System.out.println("fail: indice invalido");
            return false;
        }
        if(cadeiras.get(indice) != null){
            System.out.println("fail: cadeira ocupada");
            return false;
        }
        for(Cliente cliente : cadeiras){
            if(cliente != null && cliente.id.equals(id)){
                System.out.println("fail: gaiatooooo");
                return false;
            }
        }
        cadeiras.set(indice, new Cliente(id, fone));
        return true;
    }

    public String toString(){
        String saida = "[ ";
        for(Cliente cliente : cadeiras)
            if(cliente == null)
                saida +=  "- ";
            else
                saida += cliente + " ";
        return saida + "]";
    }
}

public class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala(0);
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){//lotacao
                sala = new Sala(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("show")){
                System.out.println(sala);
            }else if(ui[0].equals("reservar")){//id fone indice
                sala.reservar(ui[1], ui[2], Integer.parseInt(ui[3]));
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}

/*
init 5
reservar ana 85 2
reservar bia 88 3
reservar bia 88 1
reservar alvaro 90 -1
reservar alvaro 90 5
reservar luana 81 2


*/
