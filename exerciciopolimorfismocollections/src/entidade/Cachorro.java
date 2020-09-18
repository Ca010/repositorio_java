package entidade;

public class Cachorro extends Animal {

	private String correr;

	public Cachorro(String nome, int idade, String emiteSom, String correr) {
		super(nome, idade, emiteSom, correr);
		this.correr = correr;
	}

	public void correr() {
		System.out.println("correndo");
	}

	
}