package odevler;

import java.util.Scanner;

public class MetotOdev2 {

	static int asalMi(int x, int i) {

		if (x < 2)
			return 0;
		if (i == 1)
			return 1;
		if (x % i == 0)
			return 0;
		return asalMi(x, i - 1);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Sayiyi giriniz: ");
		int sayi = scan.nextInt();

		int sonuc = asalMi(sayi, sayi / 2);
		if (sonuc == 0) {
			System.out.println(sayi + " ASAL degil !");
		} else {
			System.out.println(sayi + " ASALDIR !");
		}

	}

}
