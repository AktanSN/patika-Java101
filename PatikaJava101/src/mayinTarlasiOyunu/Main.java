package mayinTarlasiOyunu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Oyun Alanýnýzýn Boyutunu Belirleyin\n");

		System.out.print("Satýr: ");
		int satir = scan.nextInt();

		System.out.print("Sütun: ");
		int sutun = scan.nextInt();

		System.out.println("===================================");
		MineSweeper m = new MineSweeper(satir, sutun);

		m.run();

	}

}
