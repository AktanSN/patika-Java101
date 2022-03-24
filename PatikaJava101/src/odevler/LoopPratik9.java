package odevler;

import java.util.Scanner;

public class LoopPratik9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int bakiye = 1500;
		int hak = 3;
		int select = 0;

		while (hak > 0) {
			System.out.print("Kullanici adi girin: ");
			String userName = scan.nextLine();

			System.out.print("Sifre girin: ");
			String password = scan.nextLine();

			switch (userName) {
			case "patika":
				switch (password) {
				case "dev123":
					do {
						System.out.println("====================");
						System.out
								.println("1-Para yatýrma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çýkýþ Yap");
						System.out.print("Ýslem secin: ");
						select = scan.nextInt();

						System.out.println("====================");
						int tutar;
						switch (select) {

						case 1:
							System.out.print("Yatýrmak istediginiz tutar: ");
							tutar = scan.nextInt();
							bakiye += tutar;
							break;
						case 2:
							System.out.print("Cekmek istediginiz tutar: ");
							tutar = scan.nextInt();
							if (bakiye >= tutar) {
								bakiye -= tutar;
							} else {
								System.out.println("Yetersiz bakiye.");
							}
							break;
						case 3:
							System.out.println("Bakiyeniz: " + bakiye);
							break;
						case 4:
							System.out.println("Gorusmek Uzere.");
							break;
						default:
							break;
						}
					} while (select != 4);
					break;
				default:
					System.out.println("Hatalý giris...");
					hak--;
					System.out.println("Kalan hak: " + hak);
					break;
				}
				break;
			default:
				System.out.println("Hatalý giris...");
				hak--;
				System.out.println("Kalan hak: " + hak);
				if (hak == 0) {
					System.out.println("Hesabýnýz bloke edildi");
				}
				break;

			}
			if (select == 4) {
				break;
			}
		}
	}

}
