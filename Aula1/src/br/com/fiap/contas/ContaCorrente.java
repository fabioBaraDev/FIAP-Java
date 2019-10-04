package br.com.fiap.contas;

public class ContaCorrente extends ContaBancaria {
	
	public ContaCorrente(String titular) {
		super(titular);
	}

	public Double saque(Double saldo) {
		return super.saque(saldo + 0.10);		 
	}

	@Override
	public String getTipo() {
		return "Conta-Corrente";
	}
}
