package aplicacao02;

import java.util.Scanner;

import exercicio02.Aviao;

public class CadastroAviao {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Aviao aviaoJoana = new Aviao();//alocar memoria
		
		
		System.out.println("Digite o modelo do avi�o: ");
		aviaoJoana.setModelo(kb.next()); 
		
		System.out.println("Digite a ag�ncia do avi�o: ");
		aviaoJoana.setAgenciaAviao(kb.next()); 
		
		System.out.println("Digite o n�mero do registro do avi�o: ");
		aviaoJoana.setNumeroRegistro(kb.next()); 
		
		System.out.println("O tanque esta cheio S - sim | N - n�o?");
		aviaoJoana.setTanque(kb.next().toUpperCase().charAt(0));
		
		System.out.println(aviaoJoana.getTanque());
		aviaoJoana.estado();
kb.close();
	}

}
