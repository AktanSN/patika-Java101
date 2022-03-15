package odevler;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Boyunuzu giriniz(metre cinsinden): ");
		double boy = scan.nextDouble();
		
		System.out.print("Kilonuzu giriniz: ");
		double kilo = scan.nextDouble();
		
		double vki = kilo/(boy*boy);
		
		System.out.println("Vücut kitle indeksiniz: "+ vki);
	}

}
