package aplicacao02;

import java.util.Scanner;

import exercicio02.Aviao;

public class CadastroAviao {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Aviao aviaoJoana = new Aviao();//alocar memoria
		
		
		System.out.println("Digite o modelo do avião: ");
		aviaoJoana.setModelo(kb.next()); 
		
		System.out.println("Digite a agência do avião: ");
		aviaoJoana.setAgenciaAviao(kb.next()); 
		
		System.out.println("Digite o número do registro do avião: ");
		aviaoJoana.setNumeroRegistro(kb.next()); 
		
		System.out.println("O tanque esta cheio S - sim | N - não?");
		aviaoJoana.setTanque(kb.next().toUpperCase().charAt(0));
		
		System.out.println(aviaoJoana.getTanque());
		aviaoJoana.estado();
kb.close();
	}

}
