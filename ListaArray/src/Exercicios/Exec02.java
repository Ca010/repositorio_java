package Exercicios;
		import java.util.Scanner;
		public class Exec02 {
			public static void main(String[] args)
			{
				//2- Faça um programa que receba 6 números inteiros e mostre:
				//• Os números pares digitados;
				//• A soma dos números pares digitados;
				//• Os números ímpares digitados;
				//• A quantidade de números ímpares digitados.
				Scanner kb = new  Scanner(System.in);
				
				int x, soma=0, impar = 0, parDigitado = 0;
				int numerosVetor[] = new int[6];
				
				for(x=0; x<numerosVetor.length;x++)
				{
					System.out.printf("Digite um número: ");
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
				
				System.out.println("Números pares digitados  ");
				
				for(int j=0; j<numerosVetor.length; j++) {
					
					if (numerosVetor[j] % 2 ==0) {
							
						System.out.println(numerosVetor[j]);
						
					} 
				}
				System.out.println("Soma dos números pares: "+soma);
				
				System.out.println("Números ímpares digitados: ");
				
				for(int j=0; j<numerosVetor.length; j++) {
						
					if (numerosVetor[j] % 2 == 1) {
							
						System.out.println(numerosVetor[j]);
						
					} 
				}
				System.out.println("Quantidade de números ímpares digitados: "+impar);
				
				kb.close();
			
			}
		}
		
	