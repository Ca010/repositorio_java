package Exercicios;

public class Exec01 {

	public static void main(String[] args) {
		//1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
		//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		//(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		//(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
		//(d) Mostre na tela cada valor do vetor A, um em cada linha.
		
		int[] vetorA = {1,0,5,-2,100,7};
		int soma = 0;
		
		soma = vetorA[0] + vetorA[1]+vetorA[5];
		
		System.out.println("A soma dos vetores �: "+soma);
		
		int[] A = {1,0,5,-2,100,7};
		
		for(int i : A)
		{
			System.out.println("\n"+i);
		}

	}

}
