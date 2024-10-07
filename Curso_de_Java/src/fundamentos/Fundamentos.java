package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {

		String nome;
		int idade = 33;
		char sexo = 'M';
		double temperatura = 31.3;
		boolean arCondicionado = false;
		nome = "Renato Vieira Santos";
		System.out.println("Uso de Variáveis na Linguagem Java");
		System.out.println("Exemplos: ");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		System.out.println("temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println("_____________________________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println("_____________________________________________________");
		System.out.println("");
		System.out.println("Estruturas de Controle");
		System.out.println("");
		System.out.println("Estruturas de Controle Condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if'");
		if (sexo == 'M') {
			System.out.println("Alistamento Militar Obrigatório");
		} 
		
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else'");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else if'");
		if (idade < 16) {
			System.out.println("Proibido Votar");
		} else if (idade >= 18 && idade <= 70){
			System.out.println("Voto obrigatório");
		} else if (idade == 16 || idade == 17 || idade >70) {
			System.out.println("Voto Facultativo");
		}
		
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do switch case'");
		System.out.println("1. Cadastro de Clientes");
		System.out.println("2. Cadastro do usuário");
		System.out.println("3. Relatórios");
		int opcao = 4;
		switch(opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'for''");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 6 - Tabuada");
		for (int tabuada = 1; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 1; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura 'while'");
		int contador = 1;
		while (contador <=  10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura 'do while'");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente? S/N");
			novoJogo = 'n';
		} while (novoJogo == 's');
			System.out.println("GAME OVER");
	}
}	
