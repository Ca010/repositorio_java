package exercicios;

import java.util.Scanner;

public class ExecLacoRepeticao02 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner kb = new Scanner(System.in);
		
		int num = 0, x, par = 0, impar = 0;
		
	
		
	
		for(x=1;x<10;x++)
		{
			System.out.println("Número inteiro aleatório de 0 até 10: " );
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
		System.out.println("Quantidade de números pares: "+ par);
		System.out.println("Quantidade de números ímpares: "+ impar);
}
}
