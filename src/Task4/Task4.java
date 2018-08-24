package Task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		System.out.println("podaj polecenie do rzutu xDy+z gdzie x - liczba rzutów kośćmi, y - rodzaj kostek (ile ścian), z - (opcjonalnie) liczba jaką należy dodać do rzutów");
		Scanner scanner = new Scanner(System.in);
		System.out.print("rzuć ");
		String dice = scanner.nextLine();
		dice = dice.trim();
		dice = dice.toUpperCase();
		System.out.println("będę rzucał " + dice);
		System.out.println("Wyrzuciłeś: " + rollDice(dice));
	}

	static int rollDice(String dice) {
		int score = 0;
		int whereIsD = dice.indexOf("D");
		int intHowMuchDice = 1;
		int intHowMuchWall = 0;
		int intPlusExtra = 0;
		int whereIsPlus = dice.indexOf("+");

		if (whereIsD > 0) {
			String howMuchDice = (String) dice.subSequence(0, whereIsD);
			intHowMuchDice = Integer.parseInt(howMuchDice);
		} else {
			intHowMuchDice = 1;
		}
		System.out.println("ilość rzutów kostką: " + intHowMuchDice);

		if (whereIsPlus > 0) {
			String plusExtra = (String) dice.subSequence(whereIsPlus + 1, dice.length());
			intPlusExtra = Integer.parseInt(plusExtra);
		} else if (whereIsPlus < 0) {
			intPlusExtra = 0;
			whereIsPlus = dice.length();
		}
		String howMuchWall = (String) dice.subSequence(whereIsD + 1, whereIsPlus);
		intHowMuchWall = Integer.parseInt(howMuchWall);
		System.out.println("ilość ścianek: " + intHowMuchWall);
		int[] walls = {3, 4, 6, 8, 10, 12, 20, 100};
		boolean corectWalls = false;

		for (int i = 0; i < walls.length; i++) {
			if (walls[i] == intHowMuchWall) {
				corectWalls = true;
			}
		}
		if (!corectWalls) {
			System.out.println("Nieprawidłowa ilość ścianek");
			System.exit(1);
		}
		System.out.println("dodatkowa ilość punktów: " + intPlusExtra);


		int[] diceWalls = new int[intHowMuchWall];
		for (int i = 0; i < diceWalls.length; i++) {
			diceWalls[i] = i + 1;
		}

		Random rnd = new Random();

//		System.out.println(Arrays.toString(diceWalls));
		for (int i = 0; i < intHowMuchDice; i++) {
			score = score + rnd.nextInt(diceWalls.length + 1);
//			System.out.println("wylosowałem na kości: " + score);;
		}
		
		return score + intPlusExtra;
	}
}
