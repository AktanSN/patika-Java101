package odevler;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int mesafe;
		int yas;
		int yolculukTipi;
		boolean isCorrect = true;

		double mesafeBasiUcret = 0.10;
		double ucret;
		double indirim = 0;

		System.out.print("Mesafe girin: ");
		mesafe = scan.nextInt();

		if (!(mesafe > 0)) {
			isCorrect = false;
		}

		System.out.print("Yas girin: ");
		yas = scan.nextInt();

		if (!(yas > 0)) {
			isCorrect = false;
		}

		System.out.print("Tek yon için 1 \nGidis-Donus icin 2\nYolculuk tipi girin: ");
		yolculukTipi = scan.nextInt();

		if (!(yolculukTipi == 1 || yolculukTipi == 2)) {
			isCorrect = false;
		}

		if (isCorrect == true) {
			ucret = mesafeBasiUcret * mesafe;

			if (yas < 12) {
				indirim = ucret * 0.5;
			} else if (yas >= 12 && yas <= 24) {
				indirim = ucret * 0.1;
			} else if (yas > 65) {
				indirim = ucret * 0.3;
			}

			ucret = ucret - indirim;

			if (yolculukTipi == 2) {
				indirim = ucret * 0.2;
				ucret = (ucret - indirim) * 2;
			}

			System.out.println("Bilet fiyatiniz: " + ucret);
		} else {
			System.out.println("Hatalý Veri Girdiniz !");
		}

	}

}
