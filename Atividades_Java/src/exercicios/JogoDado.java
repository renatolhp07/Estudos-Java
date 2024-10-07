package exercicios;

import java.util.Scanner;

public class JogoDado {

	public static void jogarDados() {

		int valorFace;

		valorFace = (int)(Math.random() * 6 + 1);
		System.out.println("O dado foi lançado e o número sorteado foi o \n" + valorFace);
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		char escolha = 's';

		System.out.println("Jogo de dados");
		System.out.println("======================\n");

		while (escolha == 'S' || escolha == 's') {
			jogarDados();
			System.out.print("Deseja lançar o dado novamente? S / N: \n");
			escolha = teclado.next().charAt(0);
		}
		teclado.close();
	}
}

