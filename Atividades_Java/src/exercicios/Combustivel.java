package exercicios;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {

		double alcool, gasolina;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Carro Flex - Qual combustível devo escolher? ");
		System.out.println("=============================================");
		
		System.out.print("Entre com o valor do álcool: R$ ");
		alcool = teclado.nextDouble();
		
		System.out.print("Entre com o valor da gasolina: R$ ");
		gasolina = teclado.nextDouble();
		
		teclado.close();
		
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abasteça com álcool para economizar dinheiro.");
		} else {
			System.out.println("Abasteça com gasolina para economizar dinheiro.");
		} 
	}
}
