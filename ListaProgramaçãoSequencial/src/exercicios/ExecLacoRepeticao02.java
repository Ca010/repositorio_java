package exercicios;

import java.util.Scanner;

public class ExecLacoRepeticao02 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner kb = new Scanner(System.in);
		
		int num = 0, x, par = 0, impar = 0;
		
	
		
	
		for(x=1;x<10;x++)
		{
			System.out.println("N�mero inteiro aleat�rio de 0 at� 10: " );
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
		System.out.println("Quantidade de n�meros pares: "+ par);
		System.out.println("Quantidade de n�meros �mpares: "+ impar);
}
}
