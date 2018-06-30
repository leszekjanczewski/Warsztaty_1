package Task1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Random r = new Random();
		int randomNumber = r.nextInt(100) + 1;
		System.out.println("Program w zgadywanie liczb od 1 do 100");
		Scanner scan = new Scanner(System.in);
		int number;
		int count = 0;
		
		while (true) {
			try {
					System.out.print("Podaj liczbę a ja sprawdzę czy zgadłeś: ");
					number = scan.nextInt();
					if (number > randomNumber) {
						System.out.println("Za dużo");
						count ++;
					} else if (number < randomNumber){
						System.out.println("Za mało");
						count ++;
					} else {
						System.out.println("Brawo zgadłeś !!! Próbowałeś " + count + " razy");
						break;
					}
			} catch (InputMismatchException ex) {
				scan.next();
				System.err.println("Nie podałeś liczby");
			}
		}
		
	}

}
