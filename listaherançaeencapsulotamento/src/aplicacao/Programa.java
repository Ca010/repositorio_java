package aplicacao;

import entidade.Pessoa;
import entidade.Vendedor;
import entidade.Administrador;
import entidade.Empregado;
import entidade.Fornecedor;
import entidade.Operario;

public class Programa {

	public static void main(String[] args) {
		
		Fornecedor clienteValor = new Fornecedor ("Nathalia", 10,10);
		Fornecedor obterSaldo = new Fornecedor();
		Empregado salario = new Empregado(0012, 1200,15);
		Operario producao = new Operario (50, 0.5,20);
		Vendedor vendas = new Vendedor(10, 20);
		Administrador ajudaDeCusto = new Administrador(500,20);
	
		System.out.println("REGISTRO FUNCIONARIO");
		System.out.println("CLIENTE"+clienteValor.getNome());
		System.out.print("CLIENTE"+clienteValor.getValorCredito());
		System.out.println("FORNECEDOR"+obterSaldo.getObterSaldo());
		System.out.println("EMPREGADO"+salario.calcularSalario());
		System.out.println("VENDEDOR"+producao.calculaProducaoOperario());
		System.out.println("VENDEDOR"+producao.calculoComissao());
		System.out.println("VENDEDOR"+vendas.calculoVendendor());
		System.out.println("ADMINISTRADOR"+ajudaDeCusto.ajudaDeCusto());
	}
}
