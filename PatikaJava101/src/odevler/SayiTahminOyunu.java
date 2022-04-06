package odevler;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	static void guessArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] != 0) {
				System.out.print((i + 1) + ". Tahmininiz: ");
				System.out.print(array[i] + " ");
			} else {
				System.out.println();
				break;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		int random = rnd.nextInt(100);

		int right = 5;
		int[] wrong = new int[5];
		boolean isWrong = false;
		boolean isWin = false;

		while (right > 0) {
			System.out.print("Lutfen tahmin ettiginiz sayiyi girin: ");
			int sayi = scan.nextInt();
			System.out.println("============================");
			if (sayi < 0 || sayi >= 100) {
				System.out.println("Hatali aralikta tahmin yaptiniz...");
				if (!isWrong) {
					System.out.println("Suanlik hakkiniz eksilmedi fakat ayný hatada eksilecektir.");
					System.out.println();
					System.out.println("Kalan hakkiniz: " + right);
					isWrong = true;
				} else {
					wrong[5 - right--] = sayi;
					System.out.println();
					System.out.println("Kalan hakkiniz: " + right);
				}
				guessArray(wrong);
				System.out.println("============================");
				continue;
			}
			if (random != sayi) {
				System.out.println("Hatali tahmin.");
				if (sayi < random) {
					System.out.println();
					System.out.println("Random sayi tahmininizden daha BUYUK");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Random sayi tahmininizden daha KUCUK");
					System.out.println();
				}
				wrong[5 - right--] = sayi;
				System.out.println("Kalan hakkiniz: " + right);
				guessArray(wrong);
			} else {
				isWin = true;
				wrong[5 - right] = sayi;
				guessArray(wrong);
				break;
			}

			System.out.println("============================");

		}
		if (isWin) {
			System.out.println("Tebrikler Bildiniz...");
		} else {
			System.out.println("Hakkiniz Bitti..");
			System.out.println("Dogru Tahmin Yapamadiniz.");
			System.out.println("Random Sayimiz: " + random);
		}

	}

}
