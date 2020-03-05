
class Pessoa {
    String nome;
    int idade;

    public Pessoa(){
        this.nome = "Fulano";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade){ //nao eh metodo, eh invocado automaticaticamente na criacao
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa david = new Pessoa();
        Pessoa fco = new Pessoa("Francisco", 12);
        System.out.println(david.nome + " " + david.idade);
    }
}