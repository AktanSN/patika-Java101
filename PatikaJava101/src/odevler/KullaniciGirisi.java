package odevler;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String kullaniciAdi="patika";
		String password="java123";
		
		String userKullaniciAdi;
		String userPassword;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanýcý Adý Girin: ");
		userKullaniciAdi= scan.nextLine();
		
		System.out.print("Password Girin: ");
		userPassword=scan.nextLine();
		
		if(userKullaniciAdi.equals(kullaniciAdi) && userPassword.equals(password)) {
			System.out.println("Giriþ Yapýldý.");
		}else if(userKullaniciAdi.equals(kullaniciAdi) && !userPassword.equals(password)){
			String kontrol; 
			String newPassword;
			System.out.println("Kullanýcý Adý veya Þifreniz Yanlýþ...");
			System.out.print("Þifrenizi Sýfýrlamak Ýster Misiniz ?(evet veya hayýr): ");
			kontrol = scan.nextLine();
			
			if(kontrol.equals("evet")) {
				System.out.print("Yeni Password Girin: ");
				newPassword= scan.nextLine();
				
				if(password.equals(newPassword)) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				}else {
					password=newPassword;
					System.out.println("Þifre oluþturuldu");
				}
			}
			
		}else if(!userKullaniciAdi.equals(kullaniciAdi) && userPassword.equals(password)) {
			System.out.println("Kullanýcý adýnýz hatalý.");
		}else {
			System.out.println("Kullanýcý adý ve þifreniz hatalý");
		}
		
	}

}
