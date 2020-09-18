package entidade;

import aplicacao.Animalprincipal;

public class Cachorro extends Animalprincipal {

	private String correr;

	public Cachorro(String correr) {
		super();
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void correr(){
		System.out.println("corre atrás do carteiro");
		}
	public void som() {
		System.out.println("Au au au");

}
} 