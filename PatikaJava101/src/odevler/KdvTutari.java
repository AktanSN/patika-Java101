package odevler;

import java.util.Scanner;

public class KdvTutari {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("KDV tutarý bulunacak para deðerini girin: ");
		double kdvsizTutar = scan.nextDouble();
		
		double kdv = kdvsizTutar * ((kdvsizTutar> 1000)? 0.8 : 0.18);
		
		double kdvliTutar = kdv + kdvsizTutar;
		
		System.out.println("KDV'siz Fiyat= " + kdvsizTutar);
		System.out.println("KDV'li Fiyat= " + kdvliTutar);
		System.out.println("KDV tutarý= " + kdv);
		
	}

}
