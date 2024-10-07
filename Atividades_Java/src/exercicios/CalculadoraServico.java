package exercicios;

import java.util.Scanner;

public class CalculadoraServico {

	public static void main(String[] args) {
		
		double hora, remuneracao, custos, cargaHoraria;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculadora de Remuneção");
		System.out.println("==========================");
		
		System.out.print("DIgite o valor da remuneração pretendida: R$ ");
		remuneracao = teclado.nextDouble();
		
		System.out.print("DIgite o custo operacional: R$ ");
		custos = teclado.nextDouble();
		
		System.out.print("DIgite a carga horária de trabalho mensal: ");
		cargaHoraria = teclado.nextDouble();
		
		teclado.close();
		
		//Esse cálculo leva em conta 30% de impostos e 20% para investimentos.
		hora = (remuneracao + (remuneracao * 0.3) + (remuneracao * 0.2) + custos) / cargaHoraria;
		
		System.out.println("==========================");
		System.out.printf("Valor da remuneração pretendida: R$ %.2f\n", remuneracao);
		System.out.printf("Custo Operacional: R$ %.2f\n", custos);
		System.out.printf("Carga Horária: %.2f horas\n", cargaHoraria);
		System.out.printf("Valor recebido por hora: R$ %.2f\n", hora);		
	}
}
