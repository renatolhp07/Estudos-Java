package array;

public class Array2 {

	public static void main(String[] args) {

		String[] [] agenda = {{"Pedro Milton", "91234-1234", "pmilton@email.com"}, 
				{"José da Silva", "94567-4567", "ze@email.com"}, 
				{"Nebacetin Rodrigues", "92585-2582", "nebacetin@email.com"}};
		
		//System.out.println("Telefone: " + agenda [0] [1]);
		
		for(int i = 0; i < agenda.length; i++) {
			for(int j = 0; j < agenda.length; j++) {
				System.out.println("------------------------------");
				System.out.println(agenda [i] [j]);
			}
		}
	}	

}
