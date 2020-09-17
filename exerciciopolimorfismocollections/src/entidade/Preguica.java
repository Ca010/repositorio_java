package entidade;

import aplicacao.Animal;

public class Preguica extends Animal {

	private String subirArvore;

	public Preguica(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	public void som() {
		System.out.println("iiiiiiiiiiiiiiiiii");
		
	}
}