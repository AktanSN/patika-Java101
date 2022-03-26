package odevler;

import java.util.Scanner;

public class MetotOdev1 {

	static int usAl(int taban, int us) {

		if (us == 0) {
			return 1;
		} else {
			return taban * usAl(taban, us - 1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Taban degeri girin: ");
		int taban = scan.nextInt();

		System.out.print("Us degeri girin:");
		int us = scan.nextInt();

		System.out.println("Sonuc: " + usAl(taban, us));
	}

}
