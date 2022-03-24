package odevler;

import java.util.Scanner;

public class LoopOdev1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Kac sayi gireceksiniz: ");
		int kacSayi = scan.nextInt();
		int sayi;

		int buyuk = 0;
		int kucuk = 0;

		for (int i = 0; i < kacSayi; i++) {

			System.out.print((i + 1) + ". sayiyi girin: ");
			sayi = scan.nextInt();

			if (i == 0) {
				kucuk = sayi;
			} else if (sayi > buyuk) {
				buyuk = sayi;
			} else if (sayi < kucuk) {
				kucuk = sayi;
			}

		}

		System.out.println("en buyuk sayi: " + buyuk);
		System.out.println("en kucuk sayi: " + kucuk);
	}

}
