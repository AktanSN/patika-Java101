package mayinTarlasiOyunu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Oyun Alan�n�z�n Boyutunu Belirleyin\n");

		System.out.print("Sat�r: ");
		int satir = scan.nextInt();

		System.out.print("S�tun: ");
		int sutun = scan.nextInt();

		System.out.println("===================================");
		MineSweeper m = new MineSweeper(satir, sutun);

		m.run();

	}

}
