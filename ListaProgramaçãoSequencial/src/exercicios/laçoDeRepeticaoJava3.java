package exercicios;

import java.util.Scanner;

public class la�oDeRepeticaoJava3 {
	public static void main(String[] args) {
	//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	
	
	int idade;
	
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Digite a sua idade: ");
	idade = kb.nextInt();
	
	if(idade >=10 && idade <=14)
	{
		System.out.println("Voc� est� inscrito na categoria infantil");
	}
	if(idade >=15 && idade <=17)
	{
		System.out.println("Voc� est� inscrito na categoria juvenil");
	}
	if(idade >=18 && idade <=25)
	{
		System.out.println("Voc� est� inscrito na categoria adulto");
	}
	else
	{
		System.out.println("Infelizmente voc� n�o se encaixa em nenhuma categoria");
	}
	}
}
