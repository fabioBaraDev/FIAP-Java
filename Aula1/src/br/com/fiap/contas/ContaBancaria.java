package br.com.fiap.contas;

public abstract class ContaBancaria implements ContasInterface {
	
	private String titular;
	private Double saldo = 0.0;
	private Integer numero;
	private String tipo;
	
	public ContaBancaria(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double saque(Double saldo) {
		return this.saldo -= saldo;
	}
	public void depositar(Double saldo) {
		this.saldo += saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public abstract String getTipo();
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
