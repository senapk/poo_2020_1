import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){ //nao eh metodo, eh invocado automaticaticamente na criacao
        this.nome = nome;
        this.idade = idade;
    }
}

public class Motoca {
	Pessoa pessoa; //agregacao
	int potencia;

	public Motoca(int potencia){
		this.potencia = potencia;
	}
	
	void embarcar(Pessoa pessoa) {
		if(this.pessoa == null)
			this.pessoa = pessoa;
		else
			System.out.println("Ja tem gente na motoca");
	}
	
	void desembarcar() {
		if(this.pessoa != null)
			this.pessoa = null;
		else
			System.out.println("Nao tem ninguem na moto");
	}

	void dirigir(){
		if(this.pessoa == null)
			System.out.println("Nao tem ninguem na moto");
		else if(this.pessoa.idade < 2)
			System.out.println("Muito pequeno pra andar de moto");
		else if(this.pessoa.idade > 10)
			System.out.println("Muito grande pra andar de moto");
		else
			System.out.println(this.pessoa.nome + ":" + fazerBarulho());
	}

	String fazerBarulho(){
		String saida = "";
		for(int i = 0; i < this.potencia; i++)
			saida += "run ";
		return saida;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Motoca motoca  = new Motoca(1);
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")) { //potencia
				Pessoa pessoa = motoca.pessoa;
				motoca = new Motoca(Integer.parseInt(ui[1]));
				motoca.embarcar(pessoa);
			}else if(ui[0].equals("embarcar")) { //nome  idade
				int idade = Integer.parseInt(ui[2]);
				Pessoa pessoa = new Pessoa(ui[1], idade);
				motoca.embarcar(pessoa);
			}else if(ui[0].equals("desembarcar")) {
				motoca.desembarcar();
			}else if(ui[0].equals("dirigir")) {
				motoca.dirigir();
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();
	}
}






