import java.util.*; 

class Gato{
    String nome;
    int vidas;
    public Gato(String nome, int vidas){
        this.nome = nome;
        this.vidas = vidas;
    }
    public String toString(){
        return nome + ":" + vidas;
    }
}

public class Mapas {
    public static void main(String[] args) {
        TreeMap<String, Gato> gatinhos = new TreeMap<>();
        
        //adicionando elementos ao mapa
        gatinhos.put("arisco", new Gato("arisco", 7));
        gatinhos.put("safado", new Gato("safadao", 3));
        gatinhos.put("jaspion", new Gato("jaspion", 500));
        Gato chaninha = new Gato("Chaninha", 1);
        gatinhos.put(chaninha.nome, chaninha);

        //imprimindo todos os pares chave valor
        System.out.println(gatinhos);

        for(String key : gatinhos.keySet()) //andando pelas chaves
            System.out.println(key);

        for(Gato gato : gatinhos.values()) //andando pelos valores ordenados pelo nome
            System.out.println(gato);

        System.out.println("chaninha tem " + gatinhos.get("Chaninha").vidas + " vida");

        gatinhos.remove("jaspion"); //jaspion foi embora do chat

        Gato jiraya = gatinhos.get("jiraya");
        if(jiraya == null){
            System.out.println("Jiraya não existe");
        }


    }




}