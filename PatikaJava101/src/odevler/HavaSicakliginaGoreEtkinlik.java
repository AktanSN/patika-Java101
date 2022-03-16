package odevler;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner. 
		 * Sýcaklýk 5 ve 15 arasýnda ise "Sinema" etkinliðini öner. 
		 * Sýcaklýk 15 ve 25 arasýnda ise "Piknik"etkinliðini öner. 
		 * Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.
		 */

		int sicaklik;

		System.out.print("Sýcaklýk giriniz: ");
		sicaklik = scan.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Kayak yapabilirsin");
		}else if(5>=sicaklik && sicaklik<=15) {
			System.out.println("Sinemaya gidebilirsin");
		}else if(sicaklik>15 && sicaklik<=25) {
			System.out.println("Pikniðe gidebilirsin");
		}else {
			System.out.println("Yüzmeye gidebilirsin");
		}
	}

}
