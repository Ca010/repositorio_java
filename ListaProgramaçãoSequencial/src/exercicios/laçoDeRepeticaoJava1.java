package exercicios;

import java.util.Scanner;

public class la�oDeRepeticaoJava1 {
	public static void main(String[] args)
	{
		
		//1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner kb = new Scanner(System.in);
		
		int num = 0, x, maiorNum = 0;
		
		for(x=1;x<=3;x++)
		{
			System.out.println("Digite um n�mero: ");
			num=kb.nextInt();
		}	
		if(num>maiorNum)
		{
			maiorNum = num++;
		}
		
		System.out.println("O maior n�mero digitado �: "+maiorNum);
	}
}
;