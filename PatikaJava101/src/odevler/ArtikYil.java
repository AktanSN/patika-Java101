package odevler;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Yil girin: ");
		int yil = scan.nextInt();

		if (yil % 100 != 0 && yil % 4 == 0) {
			System.out.println(yil + " bir artik yildir !");
		} else if (yil % 100 == 0 && yil % 400 == 0) {
			System.out.println(yil + " bir artik yildir !");
		}else {
			System.out.println(yil + " bir artik yil degildir !");
		}

	}

}
