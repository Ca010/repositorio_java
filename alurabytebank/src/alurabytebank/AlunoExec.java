package alurabytebank;

import java.util.Scanner;

public class AlunoExec {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		CadastroAlunoExec primeiroAluno = new CadastroAlunoExec();
		CadastroAlunoExec segundoAluno = new CadastroAlunoExec();
		CadastroAlunoExec terceiroAluno = new CadastroAlunoExec();
		
		CadastroAlunoExec idadeAlunoPrimeiro = new CadastroAlunoExec();
		CadastroAlunoExec idadeAlunoSegundo = new CadastroAlunoExec();
		CadastroAlunoExec idadeAlunoTerceiro = new CadastroAlunoExec();
		
		CadastroAlunoExec generoPrimeiroAluno = new CadastroAlunoExec();
		CadastroAlunoExec generoSegundoAluno = new CadastroAlunoExec();
		CadastroAlunoExec generoTerceiroAluno = new CadastroAlunoExec();
		
		System.out.println("Digite o nome do aluno:");
		primeiroAluno.nomeAluno = kb.next();
		System.out.println("Digite a idade aluno:");
		idadeAlunoPrimeiro.idadeAluno = kb.nextInt();
		System.out.println("Digite F - Feminino | M - Masculino | O - Outro:");
		generoPrimeiroAluno.generoAluno = kb.next();
		
		System.out.println();
		
		System.out.println("Digite o nome do aluno:");
		segundoAluno.nomeAluno = kb.next();
		System.out.println("Digite a idade aluno:");
		idadeAlunoSegundo.idadeAluno = kb.nextInt();
		System.out.println("Digite F - Feminino | M - Masculino | O - Outro:");
		generoSegundoAluno.generoAluno = kb.next();
		
		System.out.println();
		
		System.out.println("Digite o nome do aluno:");
		terceiroAluno.nomeAluno = kb.next();
		System.out.println("Digite a idade aluno:");
		idadeAlunoTerceiro.idadeAluno = kb.nextInt();
		System.out.println("Digite F - Feminino | M - Masculino | O - Outro:");
		generoTerceiroAluno.generoAluno = kb.next();
		
		System.out.println("Cadastro primeiro Aluno \n"+primeiroAluno.nomeAluno+"\n"+idadeAlunoPrimeiro.idadeAluno+"\n"+generoPrimeiroAluno.generoAluno+"\n");
		System.out.println("\nCadastro segundo Aluno \n"+segundoAluno.nomeAluno+"\n"+idadeAlunoSegundo.idadeAluno+"\n"+generoSegundoAluno.generoAluno+"\n");
		System.out.println("\nCadastro terceiro Aluno \n"+terceiroAluno.nomeAluno+"\n"+idadeAlunoTerceiro.idadeAluno+"\n"+generoTerceiroAluno.generoAluno+"\n");
		kb.close();
	}

}
