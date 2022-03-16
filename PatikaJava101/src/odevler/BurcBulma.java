package odevler;

import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Do�um ay�n�z� girin: ");
		int ay = scan.nextInt();

		System.out.print("Do�um g�n�n�z� girin:");
		int g�n = scan.nextInt();

		String burc = "";
		boolean isError = false;

		if (ay == 1 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 21) {
				burc = "O�lak";
			} else {
				burc = "Kova";
			}
		}else if (ay == 2 && (g�n >= 1 && g�n <= 28)) {
			if (g�n <= 19) {
				burc = "Kova";
			} else {
				burc = "Bal�k";
			}
		} else if (ay == 3 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 20) {
				burc = "Bal�k";
			} else {
				burc = "Ko�";
			}
		} else if (ay == 4 && (g�n >= 1 && g�n <= 30)) {
			if (g�n <= 20) {
				burc = "Ko�";
			} else {
				burc = "Bo�a";
			}
		} else if (ay == 5 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 21) {
				burc = "Bo�a";
			} else {
				burc = "�kizler";
			}
		} else if (ay == 6 && (g�n >= 1 && g�n <= 30)) {
			if (g�n <= 22) {
				burc = "�kizler";
			} else {
				burc = "Yenge�";
			}
		} else if (ay == 7 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 22) {
				burc = "Yenge�";
			} else {
				burc = "Aslan";
			}
		} else if (ay == 8 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 22) {
				burc = "Aslan";
			} else {
				burc = "Ba�ak";
			}
		}else if (ay == 9 && (g�n >= 1 && g�n <= 30)) {
			if (g�n <= 22) {
				burc = "Ba�ak";
			} else {
				burc = "Terazi";
			}
		} else if (ay == 10 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 22) {
				burc = "Terazi";
			} else {
				burc = "Akrep";
			}
		} else if (ay == 11 && (g�n >= 1 && g�n <= 30)) {
			if (g�n <= 21) {
				burc = "Akrep";
			} else {
				burc = "Yay";
			}
		} else if (ay == 12 && (g�n >= 1 && g�n <= 31)) {
			if (g�n <= 21) {
				burc = "Yay";
			} else {
				burc = "O�lak";
			}
		} else {
			isError = true;
		}
		if (isError) {
			System.out.println("Yanl�� aral�k girdiniz.");
		} else {
			System.out.println("Burcunuz: " + burc);
		}

	}

}
