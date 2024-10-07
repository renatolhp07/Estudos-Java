package array;

public class JogoCarta {

	public static void main(String[] args) {

		String[] nipes = {"Copas", "Espadas", "Ouros", "Paus"};
		String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		
		String nipe = nipes[(int)(Math.random() * nipes.length)];
		String face = faces[(int)(Math.random() * faces.length)];
		
		System.out.println(face + " de " + nipe);
		
		
	}
}
