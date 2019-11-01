package br.com.fiap.contas;

@SuppressWarnings("serial")
public class SaldosInsuficiente extends Exception {

	public SaldosInsuficiente(String mensagem) {
		super(mensagem);
	}
}
