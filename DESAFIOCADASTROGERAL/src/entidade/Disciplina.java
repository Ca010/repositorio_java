package entidade;

public class Disciplina {

	public String nomeDisciplina;
	public int nivel;
	
	public Disciplina(String nomeDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
	}
	public Disciplina(String nomeDisciplina, int nivel) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nivel = nivel;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}

