package exercicio03;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private String setor;
	private int idade;
	private String cpf;
	private double salario;
	
	public Funcionario()
	{
		super();
	}

	
	public Funcionario(String nome, String sobrenome, String setor, int idade, String cpf, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.setor = setor;
		this.idade = idade;
		this.cpf = cpf;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "O  funcionário "+getNome()+"  "+getSobrenome()+" CPF: "+getCpf()+" idade "+getIdade()+", trabalha no setor "+getSetor()+" com o salário de R$ "+getSalario();
	}
}
