package exercicios;

import java.util.Scanner;

public class ExecLacoRepeticao02 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner kb = new Scanner(System.in);
		
		int num = 0, x, par = 0, impar = 0;
	
		for(x=1;x<10;x++)
		{
			System.out.println("Digite n�meros inteiro aleat�rios: " );
			num = kb.nextInt();
			if(num % 2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
				
			}
		}	
	if(par==1)
	{
		System.out.println("Existe um numero par ");
	}
	else
	{
		System.out.printf("Existem %d numeros pares ", par);
	}
	if(impar==1)
	{
		System.out.println("Existe um numero �mpar ");
	}
	else
	{
		System.out.printf("Existem %d numeros impares",impar);
	}
}
}
