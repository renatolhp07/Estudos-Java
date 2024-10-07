package exercicios;

import java.util.Scanner;

public class regraTres {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double x, y, valor;
		System.out.println("Regra de 3");
		System.out.println("Digite um valor: ");
		x = teclado.nextDouble();

		System.out.println("");
		System.out.println("Digite a porcentagem que precisa ser calculada: ");
		y = teclado.nextDouble();

		valor = ((x * y) / 100);

		teclado.close();

		System.out.println("");
		System.out.printf("Valor inicial: %.2f. Porcentagem a ser calculada: %.2f %%. Valor da porcentagem: %.2f", x, y,
				valor);

	}

}
