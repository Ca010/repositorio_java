package Aplicacao;

import java.util.Scanner;

import entidades.Aluno;


public class Principal {

	public static void main(String[] args) {
		
		//estanciar
		Aluno primeiroAluno = new Aluno();
		
		
		Scanner kb = new Scanner(System.in);
	
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");
		
		System.out.println("Digite o seu nome: ");
		primeiroAluno.nomeAluno = kb.next().toUpperCase();
		System.out.println("Digite seu sexo [F|M]: ");
		primeiroAluno.sexoAluno = kb.next().toUpperCase().charAt(0);

		for(int x = 0; x<4; x++)
		{
			System.out.println("Digite a nota: ");
			primeiroAluno.nota[x] = kb.nextDouble();		
		}
		
		System.out.println("A média do aluno é: "+primeiroAluno.calculaMedia());
		System.out.println(primeiroAluno.mediaEscola);
	
	
		primeiroAluno.mostra();
		kb.close();
	}

}
