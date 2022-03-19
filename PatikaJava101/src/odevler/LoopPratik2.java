package odevler;

import java.util.Scanner;

public class LoopPratik2 {

	public static void main(String[] args) {

		/*
		 * Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul
		 * eden ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp
		 * ekrana basan programý yazýyoruz.
		 */

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int sum = 0;

		while (sayi % 2 == 0) {
			System.out.print("Sayi giriniz: ");
			sayi = scan.nextInt();

			if (sayi % 2 == 0 && sayi % 4 == 0) {
				sum += sayi;
			}
		}

		System.out.println("çift ve 4 ün kati olan sayilarin toplami: " + sum);
	}

}
