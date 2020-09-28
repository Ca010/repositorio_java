package aplicacao;

import entidade.Pessoa;
import entidade.Aluno;

public class Cadastro {
	public static void main(String[] args) {
		System.out.println("SISTEMA DE CADASTRO");
		
		//construcao do objeto
		Pessoa fulano = new Pessoa("PEDRO");
		Pessoa cicrano = new Pessoa("MARIA",1970, 'F');
		Aluno novoAluno = new Aluno();
		Aluno alunoAtual = new Aluno("JOSEFINA");
		Pessoa pessoaAtual = new Pessoa("MALAQUIAS");
		
		//TROCOU O NOME - O SET SERVE PARA MUDAR
		fulano.setNome("PAULO");
		
		//O GET SERVE PARA MOSTRAR, ELE PEGA O OBJETO
		System.out.println(fulano.getNome());
	}
}
