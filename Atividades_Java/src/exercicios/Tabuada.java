package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		//Variáveis
		
		int fator1, fator2;
		
		//Cria um objeto do tipo Scanner para receber a entrada dos dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tabuada - Descubra a tabuada de qualquer número!");
		System.out.println("=================================================");
		System.out.println("");
		System.out.print("Digite o número corresponder à tabuada que deseja saber: ");
		System.out.print("");
		
		fator1 = teclado.nextInt();
		teclado.close();
		System.out.print("\n");
		
		for (fator2 = 1; fator2 < 11; fator2++) {
			
			System.out.println(fator1 + " x " + fator2 + " = " + (fator1 * fator2));
			
		}
	}
}
