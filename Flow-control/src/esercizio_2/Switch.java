package esercizio_2;

public class Switch {

	public static void main(String[] args) {
		getLiteralNumber(3);
	}
	
	public static void getLiteralNumber(int number) {
		switch (number) {
			case 0: {
				System.out.println("zero");
				break;
			}
			case 1: {
				System.out.println("uno");
				break;
			}
			case 2: {
				System.out.println("due");
				break;
			}
			case 3: {
				System.out.println("tre");
				break;
			}
			default:
				System.out.println("Stop right there!");
			}
	}
}
