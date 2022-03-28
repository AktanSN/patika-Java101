package odevler;

import java.util.Scanner;

public class DizilerOdev1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Dizin kac elemanli olsun: ");
		int eleman = scan.nextInt();

		int[] dizi = new int[eleman];

		for (int i = 0; i < dizi.length; i++) {
			System.out.print((i + 1) + ". Elemani: ");
			dizi[i] = scan.nextInt();
		}

		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[j] < dizi[i]) {
					int temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}

		for (int i : dizi) {
			System.out.print(i + " ");
		}

	}

}
