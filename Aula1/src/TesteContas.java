
import java.util.ArrayList;

import br.com.fiap.contas.ContaCorrente;
import br.com.fiap.contas.ContaPoupanca;
import br.com.fiap.contas.ContasInterface;

public class TesteContas {
	public static void main(String[] args) {
		
		TesteContas teste = new TesteContas();
		teste.contasCC();
		teste.contasPoup();

	}

	public void contasCC() {
		
		System.out.println("****** Teste Corrente ********");
		ArrayList<ContasInterface> contas = new ArrayList<ContasInterface>(); 

		contas.add(new ContaCorrente("Joao"));
		contas.add(new ContaCorrente("Maria"));
		contas.add(new ContaCorrente("Joaquina"));
		contas.add(new ContaCorrente("Tiazinha"));
		contas.add(new ContaCorrente("Romulo"));
		
		loopDeContas(contas);
		
	}
	

	public void contasPoup() {
		
		System.out.println("****** Teste Poupança ********");
		ArrayList<ContasInterface> contas = new ArrayList<ContasInterface>(); 

		contas.add(new ContaPoupanca("Joao"));
		contas.add(new ContaPoupanca("Maria"));
		contas.add(new ContaPoupanca("Joaquina"));
		contas.add(new ContaPoupanca("Tiazinha"));
		contas.add(new ContaPoupanca("Romulo"));
		
		loopDeContas(contas);
	
	}
	private void loopDeContas(ArrayList<ContasInterface> contas) {
		
		contas.forEach(x -> {x.depositar(Math.random() * 100);
		 			   System.out.println(x.getTitular() + " tem o tipo de Conta " + x.getTipo() + " com o saldo de -> " + x.getSaldo());});

		System.out.println("*********************************************************");

		//Saquei 
		contas.forEach(x -> {x.saque(1.0);
		 			   System.out.println(x.getTitular() + " tem o tipo de Conta " + x.getTipo() + " com o saldo de -> " + x.getSaldo());});

	}
	

}
