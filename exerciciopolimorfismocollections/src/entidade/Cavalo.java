package entidade;

import aplicacao.Animalprincipal;

public class Cavalo extends Animalprincipal {

	private String correr;

	public Cavalo(String correr) {
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void correr(){
		System.out.println("cavalga pelo campo");
		}

	public void som() {
		System.out.println("relinchar");

}
} 