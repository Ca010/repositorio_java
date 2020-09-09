package exercicios;

import java.util.Scanner;

public class laçoDeRepeticaoJava3 {
	public static void main(String[] args) {
	//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
	
	
	int idade;
	
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Digite a sua idade: ");
	idade = kb.nextInt();
	
	if(idade >=10 && idade <=14)
	{
		System.out.println("Você está inscrito na categoria infantil");
	}
	if(idade >=15 && idade <=17)
	{
		System.out.println("Você está inscrito na categoria juvenil");
	}
	if(idade >=18 && idade <=25)
	{
		System.out.println("Você está inscrito na categoria adulto");
	}
	else
	{
		System.out.println("Infelizmente você não se encaixa em nenhuma categoria");
	}
	}
}
