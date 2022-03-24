package odevler;

import java.util.Scanner;

public class LoopOdev5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Eleman sayisi gir: ");
		int sayi = scan.nextInt();

		int ilk = 0;
		int iki = 1;
		int temp;

		for (int i = 0; i <= sayi; i++) {
			if (i == 0) {
				System.out.print(i + " ");
			} else {
				System.out.print(iki + " ");
				temp = iki;
				iki = ilk + iki;
				ilk = temp;

			}

		}
	}

}
