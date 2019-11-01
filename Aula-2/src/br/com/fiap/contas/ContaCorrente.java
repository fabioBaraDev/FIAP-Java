package br.com.fiap.contas;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria {
	
	private LocalDate dataNascimento;
	
	public ContaCorrente(String titular, LocalDate dataNascimento) {
		super(titular);
		this.dataNascimento = dataNascimento;
	}

	public Double saque(Double saldo) throws SaldosInsuficiente {
		if(this.getSaldo() <= 0) {
			throw new SaldosInsuficiente("Saldo insuficente você tem: " + this.getSaldo());
		}
		
		return super.saque(saldo + 0.10);		 
	}

	@Override
	public String getTipo() {
		return "Conta-Corrente";
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
}
 