package odevler;

import java.util.Scanner;

public class CinZodyakHesap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kalan;
		String burc;

		System.out.print("Dogum yilinizi girin: ");
		int dogum = scan.nextInt();

		kalan = dogum % 12;

		if (kalan == 1) {
			burc = "Horoz";
		} else if (kalan == 2) {
			burc = "Köpek";
		} else if (kalan == 3) {
			burc = "Domuz";
		} else if (kalan == 4) {
			burc = "Fare";
		} else if (kalan == 5) {
			burc = "Okuz";
		} else if (kalan == 6) {
			burc = "Kaplan";
		} else if (kalan == 7) {
			burc = "Tavþan";
		} else if (kalan == 8) {
			burc = "Ejderha";
		} else if (kalan == 9) {
			burc = "Yilan";
		} else if (kalan == 10) {
			burc = "At";
		} else if (kalan == 11) {
			burc = "Koyun";
		} else {
			burc = "Maymun";
		}

		System.out.println("Cin Zodyagi Burcunuz : " + burc);

	}

}
