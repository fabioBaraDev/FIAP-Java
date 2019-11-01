package br.com.fiap.contas;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String titular) {
		super(titular);
		super.setTipo("Conta-Poupan�a");
	}

	@Override
	public String getTipo() {
		return "Conta-Poupan�a";
	}
}
