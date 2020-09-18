package entidade;

public class Animal {
	
	private String nome;
	private int idade;
	private String som;
	private String tipoDeAcao;
	
	public String emitirSom() {
		
		return som;
	}
	

	public Animal(String nome, int idade, String som, String tipoDeAcao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.tipoDeAcao = tipoDeAcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	
	public String getTipoDeAcao() {
		return tipoDeAcao;
	}


	public void setTipoDeAcao(String tipoDeAcao) {
		this.tipoDeAcao = tipoDeAcao;
	}


	public void exibir () {
		System.out.println(" O animal " + getNome()+ " tem " + getIdade() + " anos"+ " emite um " + getSom() + " e " + getTipoDeAcao());
		
		
	}
	
	
	
	
}
