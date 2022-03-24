package odevler;

import java.util.Scanner;

public class LoopPratik10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Sayi girin: ");
		int sayi1 = scan.nextInt();

		System.out.print("Sayi girin: ");
		int sayi2 = scan.nextInt();

		int kucukSayi = sayi1;
		int ebob = 1;
		int ekok;

		if (sayi2 < sayi1) {
			kucukSayi = sayi2;
		}

		int i = kucukSayi;
		while (i > 0) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				ebob = i;
				break;
			}
			i--;
		}
		ekok = (sayi1 * sayi2) / ebob;

		System.out.println("ebob: " + ebob);
		System.out.println("ekok: " + ekok);
	}

}
