package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {

		//variáveis
		double c, f;
		
		//objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		//entrada de dados
		System.out.println("Conversão de Temperatura");
		System.out.println("Digite a temperatura em Fahrenheit: ");
		f = teclado.nextDouble();
		
		//processamento
		c = (5 * (f-32) / 9);
		//saída
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C");
		teclado.close();

	}

}
