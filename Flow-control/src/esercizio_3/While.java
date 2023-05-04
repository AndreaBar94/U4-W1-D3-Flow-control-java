package esercizio_3;

import java.util.Arrays;
import java.util.Scanner;


public class While {

	public static void main(String[] args) {
		stringDivider();
		
	}
	
	public static void stringDivider() {
		Scanner string = new Scanner(System.in);
		System.out.println("Inserisci del testo per visualizzare il risultato, altrimenti inserisci \":q\" per chiudere");
		String text = string.nextLine();
		
		if(text.contains(":q")) {
			System.out.println("Una volta ero anche io un avventuriero, poi mi sono beccato una freccia nel ginocchio.");
		}
		
		while(!text.contains(":q")) {
			String[] textSplitted = text.split("");
			System.out.println(Arrays.toString(textSplitted));
			break;
		};
		string.close();
		
	}
}
