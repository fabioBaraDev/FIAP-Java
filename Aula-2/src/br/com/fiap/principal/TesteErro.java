package br.com.fiap.principal;

import java.time.LocalDate;
import java.time.Month;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.fiap.contas.ContaCorrente;
import br.com.fiap.contas.SaldosInsuficiente;

public class TesteErro {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Painel Padrão");
		try {			
			Double resposta = metodo3();
			
			JOptionPane.showMessageDialog(frame, "Seu saldo atualizado é:\n\n " + resposta,
					"Saldo Disponivel\n\n", JOptionPane.INFORMATION_MESSAGE);
			
		} catch (SaldosInsuficiente e) {

			JOptionPane.showMessageDialog(frame, "Houve um problema Champs:\n\n " + e.getMessage(),
					"Saldo Insuficiente\n\n", JOptionPane.INFORMATION_MESSAGE);
		}

//		System.out.println("inicio do metodo 1!");
//		metodo1();
//		System.out.println("fim do metodo 1!");
	}

	static void metodo1() {
		System.out.println("inicio do metodo 1!");

		try {
			metodo2();
		} catch (NullPointerException e) {
			System.out.println("Deu Ruim Champs");
		}

		System.out.println("fim do metodo 1!");
	}

	static void metodo2() {
		System.out.println("inicio do metodo 2!");
		
		LocalDate dataNacimento = LocalDate.of(1961, Month.APRIL, 12);
		ContaCorrente cc = new ContaCorrente("Joao", dataNacimento);
		for (int i = 0; i <= 15; i++) {
			System.out.println(cc.getSaldo());
			if (i == 5) {
				cc = null;
			}
		}

		System.out.println("fim do metodo 2!");
	}

	static Double metodo3() throws SaldosInsuficiente {

		ContaCorrente cc = new ContaCorrente("Bara", LocalDate.of(1986, Month.JULY, 28));
		Double valor = Double.valueOf(JOptionPane.showInputDialog("valor do deposito"));
		cc.depositar(valor);

		Double valorSaque = Double.valueOf(JOptionPane.showInputDialog("valor do saque\n\n" + "ATENÇÃO -- Lhe será cobrado uma taxa de 0.10 centavos!"));
		return cc.saque(valorSaque);

	}
}
