package aplicacao03;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import exercicio03.Funcionario;

public class CadastroFuncionario {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Funcionario nomeFuncionario = new Funcionario();
		
		System.out.println("Digite o nome do funcion�rio:");
		nomeFuncionario.setNome(kb.next());
		
		System.out.println("Digite o sobrenome do funcion�rio:");
		nomeFuncionario.setSobrenome(kb.next());
		
		System.out.println("Digite o setor do funcion�rio:");
		nomeFuncionario.setSetor(kb.next());
		
		System.out.println("Digite a idade do funcion�rio:");
		nomeFuncionario.setIdade(kb.nextInt());
		
		System.out.println("Digite o CPF do funcion�rio:");
		nomeFuncionario.setCpf(kb.next());
		
		System.out.println("Digite o sal�rio do funcion�rio:");
		nomeFuncionario.setSalario(kb.nextDouble());
		
		System.out.println(nomeFuncionario.toString());
		
		kb.close();
	}

}
