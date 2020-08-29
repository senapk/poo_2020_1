import java.util.*; 

interface IPessoa{
    public String getNome();
    public String getFone();
}

class Amigo implements IPessoa{
    String nome;
    String fone;
    Amigo (String nome, String fone){
        this.nome = nome;
        this.fone = fone;
    }
    public String toString(){
        return "amigo " + nome + ":" + fone;
    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public String getFone() {
        return fone;
    }
}

class Pet implements IPessoa{
    String nome;
    String raca;
    Pet (String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String toString(){
        return "pet " + nome + ":" + raca;
    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public String getFone() {
        return raca;
    }
}



class Interface{
    public static void main(String[] args) {
        Amigo tim = new Amigo("tim", "456");
        Pet ninja = new Pet("ninja", "chiuaua");

        ArrayList<IPessoa> pessoas = new ArrayList<>();
        pessoas.add(tim);
        pessoas.add(ninja);
        pessoas.add(new IPessoa(){
			public String getNome() {
				return "fuxico";
			}
			public String getFone() {
				return "nao interessa";
            }
            public String toString(){
                return "vah pra china";
            }
        });

        Collections.sort(pessoas, new Comparator<IPessoa>(){
            public int compare(IPessoa arg0, IPessoa arg1) {
                return arg0.getNome().compareTo(arg1.getNome());
            }
        });

        System.out.println(pessoas);
    }
}