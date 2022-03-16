package odevler;

import java.util.Scanner;

public class SayilariBuyuktenKucuge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		int sayi3;
		
		
		
		System.out.print("Sayý giriniz: ");
		sayi1=scan.nextInt();
		
		System.out.print("Sayý giriniz: ");
		sayi2=scan.nextInt();
		
		System.out.print("Sayý giriniz: ");
		sayi3=scan.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			if(sayi2>sayi3) {
				System.out.println(sayi3+" < "+sayi2+" < "+sayi1);
			}else {
				System.out.println(sayi2+" < "+sayi3+" < "+sayi1);
			}
		}else if(sayi2>sayi1 && sayi2>sayi3) {
			if(sayi1>sayi3) {
				System.out.println(sayi3+" < "+sayi1+" < "+sayi2);
			}else {
				System.out.println(sayi1+" < "+sayi3+" < "+sayi2);
			}
		}else {
			if(sayi1>sayi2) {
				System.out.println(sayi2+" < "+sayi1+" < "+sayi3);
			}else {
				System.out.println(sayi1+" < "+sayi2+" < "+sayi3);
			}
		}
		
	
	}

}
