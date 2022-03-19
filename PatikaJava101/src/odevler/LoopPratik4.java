package odevler;

import java.util.Scanner;

public class LoopPratik4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * N elemanl� bir k�menin elemanlar� ile olu�turulacak r elemanl� farkl�
		 * gruplar�n say�s� n�in r�li kombinasyonu olarak adland�r�l�r. N�in r�li
		 * kombinasyonu C(n,r) �eklinde g�sterilir. Java ile kombinasyon hesaplayan
		 * program yaz�n�z. C(n,r) = n! / (r! * (n-r)!)
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
