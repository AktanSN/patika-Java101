package odevler;

import java.util.Scanner;

public class LoopPratik5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Java ile kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program� "For D�ng�s�" kullanarak yap�n�z.*/

		System.out.print("Ussu al�nacak sayiyi girin: ");
		int sayi=scan.nextInt();
		
		System.out.print("Ussu girin: ");
		int us=scan.nextInt();
		
		int toplam=1;
		for(int i=1;i<=us;i++) {
			toplam *= sayi;
		}
		System.out.println(sayi+ " ussu " + us+ ": "+toplam);
	}

}
