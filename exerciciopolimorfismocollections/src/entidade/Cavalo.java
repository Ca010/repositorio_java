package entidade;



public class Cavalo extends Animal {

	private String correr;

	public Cavalo(String nome, int idade, String emiteSom, String correr) {
		super(nome, idade, emiteSom,correr);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void correr() {
		System.out.println("correndo");
	}

	
}