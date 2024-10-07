package exercicios;

import java.util.Scanner;
import java.util.Random;

public class JoKenPo {

	public static void main(String[] args) {

		// Variáveis
		int jogador, computador;

		// Cria um objeto da classe Scanner e outro da classe Random
		Scanner teclado = new Scanner(System.in);
		Random r = new Random();

		// Tela Inicial do jogo
		System.out.println("Jo Ken Po");
		System.out.println("====================\n");
		System.out.println("Jogadas Possíveis: \n1.Pedra\n2.Papel\n3.Tesoura\n");
		System.out.print("Digite a opção desejada: ");

		// Recebe a jogada do jogador e gera um número aleatório para o computador.
		// Depois, analisa e determina o vencedor
		jogador = teclado.nextInt();
		teclado.close();
		computador = r.nextInt((2) + 1);
		
		while (computador <= 0) {
			computador = r.nextInt((2) + 1);
		}
		
		switch (jogador) {

		case 1:
			System.out.println("\nJogador: Pedra");
			break;

		case 2:
			System.out.println("\nJogador: Papel");
			break;

		case 3:
			System.out.println("\nJogador: Tesoura");
			break;
			
		default:
			System.out.println("\nOpção Inválida!\n");
			break;
		}

		switch (computador) {

		case 1:
			System.out.println("Computador: Pedra");
			break;

		case 2:
			System.out.println("Computador: Papel");
			break;

		case 3:
			System.out.println("Computador: Tesoura");
			break;

		}

		if (jogador == computador) {
			System.out.println("\nEMPATE!");

		} else if (jogador == 1 && computador == 2) {
			System.out.println("\nVocê perdeu!");

		} else if (jogador == 1 && computador == 3) {
			System.out.println("\nVocê venceu!");

		} else if (jogador == 2 && computador == 1) {
			System.out.println("\nVocê venceu!");

		} else if (jogador == 2 && computador == 3) {
			System.out.println("\nVocê perdeu!");

		} else if (jogador == 3 && computador == 1) {
			System.out.println("\nVocê perdeu!");

		} else if (jogador == 3 && computador == 2) {
			System.out.println("\nVocê venceu!");

		}
	}
}