package odevler;

import java.util.Scanner;

public class LoopPratik1 {

	public static void main(String[] args) {
		
		/*
		 * �dev
		 * 
		 * Java d�ng�ler ile 0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e 
		 * tam b�l�nen say�lar�n ortalamas�n� hesaplayan program� yaz�n�z. 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		int average=0;
		
		for(int i=0;i<sayi;i++) {
			if(i%3==0 && i%4==0) {
				average += i;
			}
		}
		System.out.println("3 ve 4 e b�l�nebilen sayilarin ortalamasi: " + average);
		

	}

}
