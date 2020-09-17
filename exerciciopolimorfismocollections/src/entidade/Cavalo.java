package entidade;

import aplicacao.Animal;

public class Cavalo extends Animal {

	private String correr;

	public Cavalo(String correr) {
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void correr(){
		System.out.println("correndo");
		}

	public void som() {
		System.out.println("relinchar");
		
}
}