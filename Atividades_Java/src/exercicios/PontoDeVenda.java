package exercicios;

import java.util.Scanner;

public class PontoDeVenda {

	public static void main(String[] args) {
		
		double valorTotal, desconto, totalDesconto, valorPago, troco;
		
		System.out.println("PDV - Sistema de Ponto de Vendas");
		System.out.println("===================================\n");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Valor Total da Compra: R$ ");
		valorTotal = teclado.nextDouble();
		
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		
		totalDesconto = valorTotal - ((desconto * valorTotal) / 100);
		
		System.out.print("Valor Pago: R$ ");
		valorPago = teclado.nextDouble();
		
		troco = valorPago - totalDesconto;
		teclado.close();
		
		System.out.println("\n=====================================");
		System.out.printf("Valor Total da Compra: R$ %.2f\n", valorTotal);
		System.out.printf("Desconto: %.2f %%\n", desconto);
		System.out.printf("Valor Total da Compra com desconto: R$ %.2f\n", totalDesconto);
		System.out.printf("Valor Pago: R$ %.2f\n", valorPago);
		System.out.printf("Troco: R$ %.2f\n", troco);		

	}

}
