package odevler;

import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Doðum ayýnýzý girin: ");
		int ay = scan.nextInt();

		System.out.print("Doðum gününüzü girin:");
		int gün = scan.nextInt();

		String burc = "";
		boolean isError = false;

		if (ay == 1 && (gün >= 1 && gün <= 31)) {
			if (gün <= 21) {
				burc = "Oðlak";
			} else {
				burc = "Kova";
			}
		}else if (ay == 2 && (gün >= 1 && gün <= 28)) {
			if (gün <= 19) {
				burc = "Kova";
			} else {
				burc = "Balýk";
			}
		} else if (ay == 3 && (gün >= 1 && gün <= 31)) {
			if (gün <= 20) {
				burc = "Balýk";
			} else {
				burc = "Koç";
			}
		} else if (ay == 4 && (gün >= 1 && gün <= 30)) {
			if (gün <= 20) {
				burc = "Koç";
			} else {
				burc = "Boða";
			}
		} else if (ay == 5 && (gün >= 1 && gün <= 31)) {
			if (gün <= 21) {
				burc = "Boða";
			} else {
				burc = "Ýkizler";
			}
		} else if (ay == 6 && (gün >= 1 && gün <= 30)) {
			if (gün <= 22) {
				burc = "Ýkizler";
			} else {
				burc = "Yengeç";
			}
		} else if (ay == 7 && (gün >= 1 && gün <= 31)) {
			if (gün <= 22) {
				burc = "Yengeç";
			} else {
				burc = "Aslan";
			}
		} else if (ay == 8 && (gün >= 1 && gün <= 31)) {
			if (gün <= 22) {
				burc = "Aslan";
			} else {
				burc = "Baþak";
			}
		}else if (ay == 9 && (gün >= 1 && gün <= 30)) {
			if (gün <= 22) {
				burc = "Baþak";
			} else {
				burc = "Terazi";
			}
		} else if (ay == 10 && (gün >= 1 && gün <= 31)) {
			if (gün <= 22) {
				burc = "Terazi";
			} else {
				burc = "Akrep";
			}
		} else if (ay == 11 && (gün >= 1 && gün <= 30)) {
			if (gün <= 21) {
				burc = "Akrep";
			} else {
				burc = "Yay";
			}
		} else if (ay == 12 && (gün >= 1 && gün <= 31)) {
			if (gün <= 21) {
				burc = "Yay";
			} else {
				burc = "Oðlak";
			}
		} else {
			isError = true;
		}
		if (isError) {
			System.out.println("Yanlýþ aralýk girdiniz.");
		} else {
			System.out.println("Burcunuz: " + burc);
		}

	}

}
