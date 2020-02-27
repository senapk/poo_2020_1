package s02e01_java_hello;


public class Gato {
	String name;
	int vidas;
	void miar() {
		if(this.vidas > 0)
			System.out.println("adocica meu amor adocica");
		else
			System.out.println("....");
	}
	void fingirDeMorto() {
		this.vidas -= 1;
	}
	public static void main(String[] args) {		
		Gato ghatho = new Gato();
		ghatho.name = "Beto Barbosa";
		ghatho.vidas = 7;
		for(int i = 0; i < 10; i += 1) {
			ghatho.miar();
			ghatho.fingirDeMorto();
		}
	}
}






