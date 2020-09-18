package entidade;

import aplicacao.Animalprincipal;

public class Preguica extends Animalprincipal {

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

	public void subirArvore(){
		System.out.println("descansa na árvore");
		}
	public void som() {
		System.out.println("iiiiiiiiiiiiiiiiii");

	}
} 