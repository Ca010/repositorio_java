package entidades;

public class Aluno {
	//atributos
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double nota[] =  new double[4];
	public double mediaEscola;  
	
	public void mostra()
	{
		System.out.printf("O nome do aluno é: %s do sexo %s",nomeAluno, sexoAluno);
	}
	
	public double calculaMedia()
	{
		double media = (nota[0]+nota[1]+nota[2]+nota[3])/4;
	return media;
	}
	
	public void mediaEscola(double mediaAluno)
	{
		double mediaEscola = 5;
		if(media>mediaEscola)
		{
			System.out.println("Aprovado!");
		}
		else
		{
			System.out.println("Reprovado!");
		}
		
	}
	}
