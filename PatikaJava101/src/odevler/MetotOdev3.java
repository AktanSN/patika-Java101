package odevler;

import java.util.Scanner;

public class MetotOdev3 {

	static int desen(int a, int change, int state) {
		int temp = a;

		if (temp == change && state == 1) {
			return temp;
		}
		System.out.print(change + " ");

		if (change <= 0 || state == 1) {
			while (a != change) {

				return desen(a, change + 5, 1);
			}

		}
		return desen(a, change - 5, 0);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz: ");
		int number = scanner.nextInt();
		System.out.print(desen(number, number, 0));
	}

}
