package entidade;

import aplicacao.Animal;

public class Cachorro extends Animal {

	private String correr;

	public Cachorro(String correr) {
		super();
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void correr(){
		System.out.println("correndo");
		}
	public void som() {
		System.out.println("Au au au");
		
}
}