package aplicacao03;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import exercicio03.Funcionario;

public class CadastroFuncionario {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Funcionario nomeFuncionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionário:");
		nomeFuncionario.setNome(kb.next());
		
		System.out.println("Digite o sobrenome do funcionário:");
		nomeFuncionario.setSobrenome(kb.next());
		
		System.out.println("Digite o setor do funcionário:");
		nomeFuncionario.setSetor(kb.next());
		
		System.out.println("Digite a idade do funcionário:");
		nomeFuncionario.setIdade(kb.nextInt());
		
		System.out.println("Digite o CPF do funcionário:");
		nomeFuncionario.setCpf(kb.next());
		
		System.out.println("Digite o salário do funcionário:");
		nomeFuncionario.setSalario(kb.nextDouble());
		
		System.out.println(nomeFuncionario.toString());
		
		kb.close();
	}

}
