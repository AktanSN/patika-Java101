package odevler;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String kullaniciAdi="patika";
		String password="java123";
		
		String userKullaniciAdi;
		String userPassword;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullan�c� Ad� Girin: ");
		userKullaniciAdi= scan.nextLine();
		
		System.out.print("Password Girin: ");
		userPassword=scan.nextLine();
		
		if(userKullaniciAdi.equals(kullaniciAdi) && userPassword.equals(password)) {
			System.out.println("Giri� Yap�ld�.");
		}else if(userKullaniciAdi.equals(kullaniciAdi) && !userPassword.equals(password)){
			String kontrol; 
			String newPassword;
			System.out.println("Kullan�c� Ad� veya �ifreniz Yanl��...");
			System.out.print("�ifrenizi S�f�rlamak �ster Misiniz ?(evet veya hay�r): ");
			kontrol = scan.nextLine();
			
			if(kontrol.equals("evet")) {
				System.out.print("Yeni Password Girin: ");
				newPassword= scan.nextLine();
				
				if(password.equals(newPassword)) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				}else {
					password=newPassword;
					System.out.println("�ifre olu�turuldu");
				}
			}
			
		}else if(!userKullaniciAdi.equals(kullaniciAdi) && userPassword.equals(password)) {
			System.out.println("Kullan�c� ad�n�z hatal�.");
		}else {
			System.out.println("Kullan�c� ad� ve �ifreniz hatal�");
		}
		
	}

}
