package odevler;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double armutKGF= 2.14;
		double elmaKGF = 3.67;
		double domatesKGF = 1.11;
		double muzKGF = 0.95;
		double patlicanKGF = 5;
		
		System.out.print("Armut Kaç Kilo ? : ");
		double armutToplam=scan.nextDouble();
		
		System.out.print("Elma Kaç Kilo ? : ");
		double elmaToplam=scan.nextDouble();
		
		System.out.print("Domates Kaç Kilo ? : ");
		double domatesToplam=scan.nextDouble();
		
		System.out.print("Muz Kaç Kilo ? : ");
		double muzToplam=scan.nextDouble();
		
		System.out.print("Patlýcan Kaç Kilo ? : ");
		double patlicanToplam=scan.nextDouble();
		
		double toplam= armutKGF*armutToplam+elmaKGF*elmaToplam+domatesKGF*domatesToplam+muzKGF*muzToplam+patlicanKGF*patlicanToplam;
	
		System.out.println("Toplam tutar: "+ toplam);
	}

}
