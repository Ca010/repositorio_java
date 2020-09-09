package exercicios;

import java.util.Scanner;

public class laçoDeRepeticaoJava2 {
	public static void main(String[] args) {
	
	//2-	Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner kb = new Scanner(System.in);
		
	int a = 0, b = 0, c = 0,x;

		System.out.println("Digite um número: ");
		a=kb.nextInt();
	
		System.out.println("Digite um número: ");
		b=kb.nextInt();
	
		System.out.println("Digite um número: ");
		c=kb.nextInt();
		
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("A ordem crescente desses números é: "+a+","+b+","+c);
			}
			else if (a<c)
			{
				System.out.println("A ordem crescente desses números é: "+a+","+c+","+b);
			}
			else
			{
				System.out.println("A ordem crescente desses números é: "+c+","+a+","+b);
			}
		}
		else if (b<c)
		{
			if(a<c)
			{
				System.out.println("A ordem crescente desses números é: "+b+","+a+","+c);
			}
			else 
			{
				System.out.println("A ordem crescente desses números é: "+b+","+c+","+a);
			}
		}else
			{
				System.out.println("A ordem crescente desses números é: "+c+","+b+","+a);
			}
		}
}

