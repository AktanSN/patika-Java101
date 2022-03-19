package odevler;

import java.util.Scanner;

public class LoopPratik1 {

	public static void main(String[] args) {
		
		/*
		 * Ödev
		 * 
		 * Java döngüler ile 0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e 
		 * tam bölünen sayýlarýn ortalamasýný hesaplayan programý yazýnýz. 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		int average=0;
		
		for(int i=0;i<sayi;i++) {
			if(i%3==0 && i%4==0) {
				average += i;
			}
		}
		System.out.println("3 ve 4 e bölünebilen sayilarin ortalamasi: " + average);
		

	}

}
