package kod;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		boolean isRunning = true;

		while (isRunning) {
			ArrayList<Double> fibArray = new ArrayList<Double>();
			fibArray.add(1.0);
			fibArray.add(1.0);

			System.out.println("Vilket Fibonacci-tal i ordningen vill du skriva ut?");

			try {
				input = Integer.parseInt(scan.nextLine());
				for (int i = 2; i < input; i++) {
					fibArray.add(fibArray.get(i - 1) + fibArray.get(i - 2));
				}
				System.out.println("Fibonaccital nr " + input + " är " + fibArray.get(input - 1));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Ogiltigt val, endast siffror mellan 1-10");

			} catch (Exception e) {
				System.out.println("Något blev fel, försök igen");
				System.out.println("Endast siffror, heltal mellan 1-10");
			}

			System.out.println();
//			while (true) {
//				System.out.println("Vill du fortsätta? j/n");
//				String runAgain = "";
//				runAgain = scan.nextLine().toLowerCase();
//				switch (runAgain) {
//
//				case "n":
//					System.out.println("Tack för idag");
//					isRunning = false;
//					break;
//
//				case "j":
//					System.out.println();
//					input = 0;
//					break;
//
//				default:
//					System.out.println("Svara med endast j eller n");
//					break;
//				}
//			}

		}

	}

}
