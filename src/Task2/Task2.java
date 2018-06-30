/*
 * SYMULATOR LOTTO
 */
package Task2;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj 6 liczb z zakresu 1 - 49 oddzialejąc je spacją: ");
		String line = scan.nextLine();
		
		scan.close();
		
		String[] split = line.split(" ");
		if (split.length < 6) {
			System.out.println("Musisz podać 6 liczb");
			return;
		}
		
		int[] numbers = new int[6];
		int[] genNumbers = genLotto();
		
		for (int i = 0; i < split.length; i++) {
			try {
				int number = Integer.parseInt(split[i]);
				
				if (number < 1 || number > 49) {
					System.out.println("Liczby muszą być z zakresu 1-49");
					return;
				}
				
				for (int j = i + 1; j < split.length; j++) {
					int element = Integer.parseInt(split[j]);
					if ( element == number) {
						System.out.println("Podałeś dwa razy taką samą liczbę");
						return;
					}
				}
				numbers[i] = number;
			} catch (NumberFormatException e) {
				System.err.println("Nie podałeś liczb");
				return;
			}
		}
		
		Arrays.sort(genNumbers);
		Arrays.sort(numbers);
		int points = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == genNumbers[j]) {
					points ++;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(genNumbers));
		
		if (points == 3) {
			System.out.println("Trafiłeś trójkę");
		} else if (points == 4){
			System.out.println("Trafiłeś czwórkę");
		} else if (points == 5) {
			System.out.println("Trafiłeś pięć liczb");
		} else if (points == 6) {
			System.out.println("ZAPAMIĘTAJ TE LICZBY i LEĆ SKREŚLIĆ TOTKA");
		} else if (points == 1){
			System.out.println("Nie masz szczęścia. Zgadłeś " + points + " liczbę");
		} else {
			System.out.println("Nie masz szczęścia. Zgadłeś " + points + " liczby");
		}
	}

	static int[] genLotto() {
		int[] arr = new int[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		ArrayUtils.shuffle(arr);
		return new int[] { arr[0], arr[1], arr[2], arr[3], arr[4], arr[5] };
	}
}
