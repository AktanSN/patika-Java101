package odevler;

import java.util.Scanner;

public class PratikMetot1 {

	static boolean isPalindrom(int num) {
		int temp = num;
		int lastNum;
		int reverseNum = 0;

		while (temp != 0) {
			lastNum = temp % 10;
			reverseNum = (reverseNum * 10) + lastNum;
			temp /= 10;
		}

		if (reverseNum == num) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayi girin: ");
		int sayi = scan.nextInt();

		if (isPalindrom(sayi)) {
			System.out.println(sayi + " Palindrom sayidir.");
		} else {
			System.out.println(sayi + " Palindrom sayi degildir.");
		}

	}

}
