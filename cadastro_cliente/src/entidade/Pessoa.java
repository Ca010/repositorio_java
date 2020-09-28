package entidade;

public class Pessoa {

	private String nome, email, cpf, cnpj, tel, cep, log, num, bairro, cidade, estado;

	public Pessoa(String nome, String email, String cpf, String cnpj, String tel, String cep, String log, String num,
			String bairro, String cidade, String estado) {

		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.tel = tel;
		this.cep = cep;
		this.log = log; 
		this.num = num;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;

	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;

	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
