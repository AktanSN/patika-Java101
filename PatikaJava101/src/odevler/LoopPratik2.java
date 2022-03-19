package odevler;

import java.util.Scanner;

public class LoopPratik2 {

	public static void main(String[] args) {

		/*
		 * Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul
		 * eden ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p
		 * ekrana basan program� yaz�yoruz.
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

		System.out.println("�ift ve 4 �n kati olan sayilarin toplami: " + sum);
	}

}
