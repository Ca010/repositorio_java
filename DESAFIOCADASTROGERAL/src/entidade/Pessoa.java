package entidade;

public class Pessoa 
{
	private String nome;
	private char sexo;
	private String etnia;
	private int anoNasc;
	
	//AQUI ELE RECEBE OS OBJEOS DE QLQR FORMA, TODOS, EM QLQR SEQUENCIA

	//construtor serve para construir o objeto
	public Pessoa() {
		
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	//sobrecarga
	public Pessoa(String nome, int anoNasc)
	{
		this.nome = nome;
		this.anoNasc = anoNasc;
	}
	public Pessoa(String nome, int anoNasc, char sexo)
	{
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.sexo = sexo;
	}
	public Pessoa(String nome, int anoNasc, char sexo, String etnia)
	{
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.sexo = sexo;
		this.etnia = etnia;
	}

	public String getNome() {
		return nome;
	}
	//SET TROCA
	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	
	
}
