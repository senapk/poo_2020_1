import java.util.ArrayList;

class Fone{
    public String id;
    public String number;
    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return id + ":" + number;
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
        for(Fone fone : this.fones)
            saida += "[" + fone + "]";
        return saida;
    }

    public void addFone(String id, String number){ //composicao
        fones.add(new Fone(id, number));
    }

}


public class Solver{
    public static void main(String[] args) {
        Contato contato = new Contato("francisco");
        //contato.fones.add(new Fone("oi", "8888")); //erro terrível
        contato.addFone("oi", "88");
        contato.addFone("tim", "99");
        contato.addFone("vivo", "94");
        System.out.println(contato);
    }
}