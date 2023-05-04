package esercizio_4;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		timer();
	}
	
	public static void timer() {
		Scanner insertNumber = new Scanner(System.in);
		System.out.println("Inserisci un numero!");
		int number = insertNumber.nextInt();
		for(int i = number; i>= 0; i--) {
			System.out.println(i);
		}
		insertNumber.close();
	}
}
