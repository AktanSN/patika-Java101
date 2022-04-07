package mayinTarlasiOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int rowNumber;
	int colNumber;
	int mayinSayisi;

	MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		mayinSayisi = (rowNumber * colNumber) / 4;
	}

	void run() {
		char[][] areaSpace = new char[rowNumber][colNumber];
		char[][] areaMine = new char[rowNumber][colNumber];

		for (char[] i : areaSpace) {
			Arrays.fill(i, '-');
		}
		for (char[] i : areaMine) {
			Arrays.fill(i, '-');
		}

		mineArea(areaMine);
		System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz !");

		printArea(areaSpace);

		while (!(isWin(areaSpace))) {

			Scanner scan = new Scanner(System.in);
			System.out.print("Satýr Giriniz: ");
			int satir = scan.nextInt();

			System.out.print("Sütun Giriniz: ");
			int sutun = scan.nextInt();

			if (sutun < 0 || sutun >= areaMine[0].length || satir >= areaMine.length || satir < 0) {
				System.out.println("Uygun deger giriniz...");
				System.out.println("===================================");
				printArea(areaSpace);
				continue;
			}

			if (areaSpace[satir][sutun] != '-') {
				System.out.println("Bu koordinaata daha önce deðer girildi..");
				System.out.println("===================================");
				printArea(areaSpace);
				continue;
			}

			if (areaMine[satir][sutun] == '*') {
				System.out.println("Kaybettiniz Mayýn Patladý !!");
				break;
			}

			areaSpace[satir][sutun] = (char) (mineCount(satir, sutun, areaMine) + '0');
			System.out.println("===================================");
			printArea(areaSpace);

		}
		printMineArea(areaMine);
	}

	char[][] mineArea(char[][] array) {
		Random rnd = new Random();

		int i = 0;
		while (i < this.mayinSayisi) {
			int mineRow = rnd.nextInt(this.rowNumber);
			int mineCol = rnd.nextInt(this.colNumber);
			if (array[mineRow][mineCol] != '*') {
				array[mineRow][mineCol] = '*';
				i++;
			}

		}

		return array;
	}

	int mineCount(int satir, int sutun, char[][] areaMine) {
		int count = 0;

		if (sutun - 1 >= 0 && areaMine[satir][sutun - 1] == '*') {
			count++;
		}
		if (sutun + 1 < areaMine[0].length && areaMine[satir][sutun + 1] == '*') {
			count++;
		}
		if (satir + 1 < areaMine.length && areaMine[satir + 1][sutun] == '*') {
			count++;
		}
		if (satir - 1 >= 0 && areaMine[satir - 1][sutun] == '*') {
			count++;
		}
		if (satir - 1 >= 0 && sutun - 1 >= 0 && areaMine[satir - 1][sutun - 1] == '*') {
			count++;
		}
		if (satir - 1 >= 0 && sutun + 1 < areaMine[0].length && areaMine[satir - 1][sutun + 1] == '*') {
			count++;
		}
		if (satir + 1 < areaMine.length && sutun - 1 >= 0 && areaMine[satir + 1][sutun - 1] == '*') {
			count++;
		}
		if (satir + 1 < areaMine.length && sutun + 1 < areaMine[0].length && areaMine[satir + 1][sutun + 1] == '*') {
			count++;
		}

		return count;
	}

	void printArea(char[][] areaSpace) {
		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				System.out.print(areaSpace[i][j] + " ");
			}
			System.out.println();
		}
	}

	void printMineArea(char[][] areaMine) {
		System.out.println("===================================");
		System.out.println("Mayýnlarýn konumu");

		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				System.out.print(areaMine[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
	}

	boolean isWin(char[][] areaSpace) {
		int flag = 0;
		for (char[] i : areaSpace) {
			for (char j : i) {
				if (j == '-') {
					flag++;
				}
			}
		}
		if (flag == this.mayinSayisi) {
			System.out.println("     Tebrikler Kazandýnýz !!!	");
			return true;
		}

		return false;
	}
}
