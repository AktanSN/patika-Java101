package odevler;

import java.util.Scanner;

public class LoopPratik4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * N elemanlý bir kümenin elemanlarý ile oluþturulacak r elemanlý farklý
		 * gruplarýn sayýsý n’in r’li kombinasyonu olarak adlandýrýlýr. N’in r’li
		 * kombinasyonu C(n,r) þeklinde gösterilir. Java ile kombinasyon hesaplayan
		 * program yazýnýz. C(n,r) = n! / (r! * (n-r)!)
		 */

		System.out.print("N degeri girin: ");
		int n = scan.nextInt();

		System.out.print("R degeri girin: ");
		int r = scan.nextInt();

		long nToplam = 1;
		long rToplam = 1;
		long subNRToplam = 1;

		for (int i = 1; i <= n; i++) {
			nToplam *= i;
		}

		for (int i = 1; i <= r; i++) {
			rToplam *= i;
		}

		for (int i = 1; i <= (n - r); i++) {
			subNRToplam *= i;
		}
		
		System.out.println("N in R li kombinasyonu: " + (nToplam) / (rToplam * subNRToplam));

	}

}
