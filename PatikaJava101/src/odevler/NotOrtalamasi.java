package odevler;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fizik Notunuzu Giriniz: ");
		double fizik = scan.nextDouble();
		
		System.out.print("Kimya Notunuzu Giriniz: ");
		double kimya = scan.nextDouble();
		
		System.out.print("T�rk�e Notunuzu Giriniz: ");
		double turkce = scan.nextDouble();
		
		System.out.print("Tarih Notunuzu Giriniz: ");
		double tarih = scan.nextDouble();
		
		System.out.print("M�zik Notunuzu Giriniz: ");
		double muzik = scan.nextDouble();
		
		double ort = (fizik+kimya+turkce+tarih+muzik)/5;
		
		String durum = (ort>60)? "S�n�f� Ge�ti" : "S�n�fta Kald�";
		
		System.out.println(durum);
		
	}

}
