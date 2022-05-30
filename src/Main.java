
public class Main {

	public static void main(String[] args) {
		Cliente Adauto = new Cliente();
		Adauto.setNome("Adauto");
		
		Conta cc = new ContaCorrente(Adauto);
		Conta poupanca = new ContaPoupanca(Adauto);
		
		cc.depositar(150);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
