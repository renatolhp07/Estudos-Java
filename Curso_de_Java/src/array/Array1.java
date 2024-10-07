package array;

public class Array1 {

	public static void main(String[] args) {

		String[] carros = {"ferrari", "fusca", "camaro", "uno"};
		//Índice do array     [0]        [1]     [2]      [3] 
		
		System.out.println("Tamanho do array: " + carros.length);
		System.out.println("Carro: " + carros[3]);
		
		carros[2] = "porsche";
		
		System.out.println("__________________________________________");
		
		for(int i = 0; i < carros.length; i++) {
			
			System.out.println("Carro: " + carros[i]);
			
		}
	}

}
