package Exercicios;
		import java.util.Scanner;
		public class Exec02 {
			public static void main(String[] args)
			{
				//2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
				//� Os n�meros pares digitados;
				//� A soma dos n�meros pares digitados;
				//� Os n�meros �mpares digitados;
				//� A quantidade de n�meros �mpares digitados.
				Scanner kb = new  Scanner(System.in);
				
				int x, soma=0, impar = 0, parDigitado = 0;
				int numerosVetor[] = new int[6];
				
				for(x=0; x<numerosVetor.length;x++)
				{
					System.out.printf("Digite um n�mero: ");
					numerosVetor[x] = kb.nextInt();
					if(numerosVetor[x] % 2 == 0)
					{
						
						soma+=numerosVetor[x];
					}
					else
					{
						impar++;
					}
				}
				
				System.out.println("N�meros pares digitados  ");
				
				for(int j=0; j<numerosVetor.length; j++) {
					
					if (numerosVetor[j] % 2 ==0) {
							
						System.out.println(numerosVetor[j]);
						
					} 
				}
				System.out.println("Soma dos n�meros pares: "+soma);
				
				System.out.println("N�meros �mpares digitados: ");
				
				for(int j=0; j<numerosVetor.length; j++) {
						
					if (numerosVetor[j] % 2 == 1) {
							
						System.out.println(numerosVetor[j]);
						
					} 
				}
				System.out.println("Quantidade de n�meros �mpares digitados: "+impar);
				
				kb.close();
			
			}
		}
		
	