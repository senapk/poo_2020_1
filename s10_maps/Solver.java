import java.util.*; 


class Pessoa implements Comparable<Pessoa>{
    String nome;
    String fone;
    Pessoa (String nome, String fone){
        this.nome = nome;
        this.fone = fone;
    }
    public String toString(){
        return nome + ":" + fone;
    }

    public int compareTo(Pessoa other){
        return this.nome.compareTo(other.nome);
    }
}

class ComparaPorFone implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        return arg0.fone.compareTo(arg1.fone);
    }
}

class Solver{
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Zeca", "321"));
        pessoas.add(new Pessoa("Bita", "123"));
        pessoas.add(new Pessoa("Cain", "455"));

        
        ArrayList<Pessoa> fones = new ArrayList<>(pessoas); //copiar de pessoas

        Collections.sort(pessoas);

        ComparaPorFone comparaPorNome = new ComparaPorFone();

        Collections.sort(fones, comparaPorNome); //criei um objeto capaz de comparar
        
        Collections.sort(fones, 
        
        new Comparator<Pessoa>(){ //classe anonima
            @Override
			public int compare(Pessoa arg0, Pessoa arg1) {
                return arg0.nome.compareTo(arg1.nome);
			}
        }
        
        );

        System.out.println(pessoas);
        System.out.println(fones);
    }

}