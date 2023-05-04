package esercizio_1;

public class Main_1 {

	public static void main(String[] args) {
		stringaPariDispari("falso");
		annoBisestile(2024);

	}
	
	
	
	public static void stringaPariDispari(String word) {
		if(word.length() % 2 == 0 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	
	public static void annoBisestile(int year) {
		if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
