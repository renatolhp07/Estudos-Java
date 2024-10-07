package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoIMC {

	public static void main(String[] args) {

		double peso, altura, imc;
		String formato = "#0.0";

		DecimalFormat df = new DecimalFormat(formato);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Calculadora de IMC");
		System.out.println("=======================\n");

		System.out.print("Digite o peso atual (Kg): ");
		peso = teclado.nextDouble();

		System.out.print("Digite a sua altura: ");
		altura = teclado.nextDouble();

		imc = peso / (altura * altura);

		teclado.close();

		if (imc <= 18.5) {
			System.out.println("Seu IMC é de " + df.format(imc) + ". Você está abaixo do peso ideal.");

		} else if (imc > 18.5 && imc <= 24.9) {
			System.out.println("Seu IMC é de " + df.format(imc) + ". Você está no seu peso ideal.");

		} else if (imc > 24.9 && imc <= 29.9) {
			System.out.println("Seu IMC é de " + df.format(imc) + ". Você está com sobrepeso (Obesidade Grau 1).");

		} else if (imc > 29.9 && imc <= 39.9) {
			System.out.println("Seu IMC é de " + df.format(imc) + ". Você está com obesidade grau 2.");

		} else {
			System.out.println("Seu IMC é de " + df.format(imc) + ". Você está com obesidade grave! (Grau 3).");

		}
	}
}
