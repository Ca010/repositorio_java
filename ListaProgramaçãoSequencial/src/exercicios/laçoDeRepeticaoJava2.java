package exercicios;

import java.util.Scanner;

public class la�oDeRepeticaoJava2 {
	public static void main(String[] args) {
	
	//2-	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner kb = new Scanner(System.in);
		
	int a = 0, b = 0, c = 0,x;

		System.out.println("Digite um n�mero: ");
		a=kb.nextInt();
	
		System.out.println("Digite um n�mero: ");
		b=kb.nextInt();
	
		System.out.println("Digite um n�mero: ");
		c=kb.nextInt();
		
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("A ordem crescente desses n�meros �: "+a+","+b+","+c);
			}
			else if (a<c)
			{
				System.out.println("A ordem crescente desses n�meros �: "+a+","+c+","+b);
			}
			else
			{
				System.out.println("A ordem crescente desses n�meros �: "+c+","+a+","+b);
			}
		}
		else if (b<c)
		{
			if(a<c)
			{
				System.out.println("A ordem crescente desses n�meros �: "+b+","+a+","+c);
			}
			else 
			{
				System.out.println("A ordem crescente desses n�meros �: "+b+","+c+","+a);
			}
		}else
			{
				System.out.println("A ordem crescente desses n�meros �: "+c+","+b+","+a);
			}
		}
}

