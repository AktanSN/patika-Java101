package odevler;

import java.util.Scanner;

public class SýnýfGecme {

	public static void main(String[] args) {
		int matematik;
		int fizik;
		int turkce;
		int kimya;
		int muzik;
		double average=0;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu girin: ");
		matematik=scan.nextInt();
		if(matematik<=100 && matematik>=0) {
			average+=matematik;
			count++;
		}
		
		System.out.print("Fizik notunuzu girin: ");
		fizik=scan.nextInt();
		if(fizik<=100 && fizik>=0) {
			average+=fizik;
			count++;
		}
		
		System.out.print("Türkçe notunuzu girin: ");
		turkce=scan.nextInt();
		if(turkce<=100 && turkce>=0) {
			average+=turkce;
			count++;
		}
		
		System.out.print("Kimya notunuzu girin: ");
		kimya=scan.nextInt();
		if(kimya<=100 && kimya>=0) {
			average+=kimya;
			count++;
		}
		
		System.out.print("Müzik notunuzu girin: ");
		muzik=scan.nextInt();
		if(muzik<=100 && muzik>=0) {
			average+=muzik;
			count++;
		}
		
		if(average != 0) {
			average /= count;
		}
		
		
		if(average<=55) {
			System.out.println("Sýnýfta Kaldýnýz..");
			System.out.println("Ortalamanýz: " + average);
		}else {
			System.out.println("Sýnýfý Geçtiniz...");
			System.out.println("Ortalamanýz: " + average);
		}
		

		
	}

}
