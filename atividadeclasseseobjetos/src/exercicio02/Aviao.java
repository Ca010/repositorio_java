package exercicio02;

public class Aviao {

	//atributos
	private String modelo;
	private String agenciaAviao;
	private String numeroRegistro;
	private char tanque; 
	
	public Aviao() {
		
	}
	
	public Aviao(String modelo, String agenciaAviao, String numeroRegistro, char tanque) {
		super();
		this.modelo = modelo;
		this.agenciaAviao = agenciaAviao;
		this.numeroRegistro = numeroRegistro;
		this.tanque = tanque;
	}

	public void estado(){
	{
		if(getTanque() == 'S') 
		{System.out.println("Tanque cheio, pronto para decolar!");
		}
		else {
			System.out.println("Tanque vazio! Por favor, encher antes de decolar!");
		
		}

	}
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public String getAgenciaAviao() {
		return agenciaAviao;
	}

	public void setAgenciaAviao(String agenciaAviao) {
		this.agenciaAviao = agenciaAviao;
	}
	
	

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public char getTanque() {
		return tanque;
	}

	public void setTanque(char tanque) {
		this.tanque = tanque;
	}
	
	
}
