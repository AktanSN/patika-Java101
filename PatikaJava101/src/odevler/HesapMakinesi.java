package odevler;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int num1;
		int num2;
		int select;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		num1 = scan.nextInt();
		
		System.out.print("Sayý giriniz: ");
		num2 = scan.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Ýþlem seçiniz:");
		select = scan.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Toplam: " + (num1+num2));
				break;
			case 2:
				System.out.println("Çýkarma: "+ (num1-num2));
				break;
			case 3:
				System.out.println("Çarpma: " + (num1*num2));
				break;
			case 4:
				if(num2 != 0) {
					System.out.println("Bölme: " + (num1/num2));
				}else {
					System.out.println("0 ile bölünemez");
				}
				break;
			default: 
				System.out.println("Uygun giriþ yapýnýz");
		}

	}

}
