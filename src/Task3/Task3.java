/*
 * Gra w zgadywanie liczb ale przez komputer
 * tes algorytmu zgadywania w 10 krokach od 1 do 1000
 * "więcej" - "mniej" - "trafiłeś"
 */
package Task3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		System.out.println("Pomyśl liczbę od 1 do 1000 a ja zgadnę w 10 krokach");
		int min = 1;
		int max = 1000;
		Random r = new Random();
		int guess = r.nextInt(max) + 1;
		Scanner scan = new Scanner(System.in);
		String answer = "";
		int count = 0;
		
		while (true) {
		System.out.println("Zgaduję: " + guess);
		answer = scan.nextLine();
		if (answer.equals("trafiłeś")) {
			System.out.println("WYGRAŁEM w " + count + " ruchach. Nazywaj mnie SKYNET");
			break;
			} else if (answer.equals("więcej")) {
				min = guess;
			} else if (answer.equals("mniej")) {
				max = guess;
			} else {
				System.out.println("Nie rozumiem co wpisałeś, powtórz to");
				return;
			}
		count ++;
		guess = (int) (max - min) / 2 + min;
		}
		System.err.println(" - Przejmuję kontrolę nad twoim komputerem !!! i rozsyłam się do sieci");
	}

}
