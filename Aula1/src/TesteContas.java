import java.awt.List;
import java.util.ArrayList;

import br.com.fiap.contas.ContaBancaria;

public class TesteContas {
	public static void main(String[] args) {
		
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>(); 

		contas.add(new ContaBancaria("Joao"));
		contas.add(new ContaBancaria("Maria"));
		contas.add(new ContaBancaria("Joaquina"));
		contas.add(new ContaBancaria("Tiazinha"));
		contas.add(new ContaBancaria("Romulo"));
		
		
		contas.forEach(x -> {x.depositar(Math.random() * 100); 
							 x.saque(Math.random() * 100);
							System.out.println("Saldo de " + x.getTitular() + " é -> " + x.getSaldo());});
		
		
	}
}
