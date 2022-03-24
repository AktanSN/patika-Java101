package odevler;

import java.util.Scanner;

public class PratikMetot3 {

	static int toplama(int a, int b) {
		int result = a + b;

		return result;
	}

	static int cikarma(int a, int b) {
		int result = a - b;

		return result;
	}

	static int carpma(int a, int b) {
		int result = a * b;

		return result;
	}

	static int bolme(int a, int b) {
		int result = a / b;

		return result;
	}

	static int usAlma(int taban, int us) {

		int result = 1;
		for (int i = 0; i < us; i++) {
			result *= taban;
		}

		return result;
	}

	static int faktoriyel(int sayi) {

		int result=1;
		int temp=sayi;
		for(int i=0;i<sayi;i++) {
			result*=temp;
			temp--;
		}

		return result;
	}
	
	static int mod(int sayi1,int sayi2) {

		int result = sayi1 % sayi2;
		
		return result;
	}
	
	static void dikdortgenAlanCevre(int kısaKenar,int uzunKenar) {

		int alan= kısaKenar * uzunKenar;
		int cevre = 2*(kısaKenar+uzunKenar);
		
		System.out.println("Dikdörtgenin alanı: "+alan);
		System.out.println("Dikdörtgenin cevresi: " + cevre);
		
		
	}
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int select;
		String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n"
				+ "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";
		System.out.println(menu+"\n");
		do {
			System.out.println("============================");
			
			System.out.print("Islem giriniz: ");
			select = scan.nextInt();

			int sayi1;
			int sayi2;
			
			switch (select) {
			case 1:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Sayi giriniz: ");
				sayi2=scan.nextInt();
				
				System.out.println("Toplama: "+ toplama(sayi1, sayi2));
				break;
			case 2:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Sayi giriniz: ");
				sayi2=scan.nextInt();
				
				System.out.println("Cikarma: "+ cikarma(sayi1, sayi2));
				break;
			case 3:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Sayi giriniz: ");
				sayi2=scan.nextInt();
				
				System.out.println("Carpma: "+ carpma(sayi1, sayi2));
				break;
			case 4:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Sayi giriniz: ");
				sayi2=scan.nextInt();
				
				System.out.println("Bolme: "+ bolme(sayi1, sayi2));
				break;
			case 5:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Sayi giriniz: ");
				sayi2=scan.nextInt();
				
				System.out.println("Ussu sonucu: "+ usAlma(sayi1, sayi2));
				break;
			case 6:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Faktoriyel sonucu: "+ faktoriyel(sayi1));
				break;
			case 7:
				System.out.println("Sayi giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.println("Sayi giriniz: ");
				sayi2=scan.nextInt();
				
				System.out.println("İlk sayinin ikinci sayiya gore modu: "+ mod(sayi1, sayi2));
				break;
			case 8:
				System.out.print("Kisa kenar giriniz: ");
				sayi1=scan.nextInt();
				
				System.out.print("Uzun kenar giriniz: ");
				sayi2=scan.nextInt();
				
				dikdortgenAlanCevre(sayi1, sayi2);
				break;
			case 0:
				System.out.println("Gorusmek uzere...");
				break;

			default:
				System.out.println("Yanlis deger girdiniz...");
				break;
			}
			System.out.println("============================");
		} while (select != 0);
	}

}
