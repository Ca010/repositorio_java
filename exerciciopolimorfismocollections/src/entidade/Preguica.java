package entidade;



public class Preguica extends Animal {

	private String subirArvore;
	
	public Preguica(String nome, int idade, String emiteSom, String subirArvore) {
		super(nome, idade, emiteSom, subirArvore);
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}


}