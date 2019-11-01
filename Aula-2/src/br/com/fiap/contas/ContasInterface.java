package br.com.fiap.contas;

public interface ContasInterface {
	public void setTitular(String titular);
	public Double saque(Double saldo) throws SaldosInsuficiente ;
	public void depositar(Double saldo);
	
	public Double getSaldo();
	
	public Integer getNumero();
	public void setNumero(Integer numero);
	public String getTipo();
	public String getTitular();
	
	void setTipo(String tipo);
}
