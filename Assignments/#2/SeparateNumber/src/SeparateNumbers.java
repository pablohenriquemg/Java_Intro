/**
 * 
 */

/**
 * @author Radoslav Radoev
 */

import java.util.Scanner;

public class SeparateNumbers {
	 /***
	  * Default constructor
	  */
	public SeparateNumbers() {}
	
	/**
	 * Output single digits from number using array and for loops
	 * @param number		Number entered by user
	 */
	public static void OutDigits(int number) {
		int[] numbers = new int[5];
		
		for (int i = numbers.length - 1; i >= 0; i--) {
			numbers[i] = number % 10;
			number = number / 10;
		}
		System.out.printf("%s", numbers[0]);
		
		for (int i = 0; i < numbers.length - 1; i++) {
			System.out.printf("   %s",numbers[i + 1]);
		}
	}
	
	
	/***
	 * Ask user for a number
	 * @return	Returns number entered by the user
	 */
	public static int GetNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter five digit number: ");
		int number = scanner.nextInt();

		scanner.close();
		return number;
	}

}
