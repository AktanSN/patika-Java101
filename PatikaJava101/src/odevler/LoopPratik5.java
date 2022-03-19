package odevler;

import java.util.Scanner;

public class LoopPratik5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý "For Döngüsü" kullanarak yapýnýz.*/

		System.out.print("Ussu alýnacak sayiyi girin: ");
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
