package labs;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Teste Conta Bancaria ***");
		
		//declarando, estanciando objeto
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("111111");
		
		if(contaSimples.sacar(50)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = "+contaSimples.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque de "+ 50 +"saldo de ="+contaSimples.getSaldo());
		}
		
		contaSimples.sacar(70);
		
		
		System.out.println(contaSimples);
	}
	private static realizarSaque
}
