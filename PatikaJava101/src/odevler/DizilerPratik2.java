package odevler;


import java.util.Scanner;

public class DizilerPratik2 {
	// oncelikle diziyi siraliyoruz
	static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	// siralanan dizide girilen sayiya en yakin dizi indexini buluyoruz
	static int findNearestIndex(int[] array, int sayi) {

		sort(array);

		int nearest = (Math.abs(array[0]) + Math.abs(array[array.length - 1]));
		int index = 0;

		for (int i = 0; i < array.length; i++) {

			if (Math.abs(Math.abs(array[i]) - sayi) < nearest) {
				nearest = Math.abs(Math.abs(array[i]) - sayi);
				index = i;
			}

		}

		return index;

	}

	//buldugumuz en yakin indexten bir once ve bir sonraki indexteki degerlere bakarak
	//en yakin index in en yakin en buyuk mu yoksa en yakin en kuçuk mu olduguna karar veriyoruz.
	static void nearestMaxAndMin(int[] array, int index, int sayi) {
		int temp1 = array[index + 1];
		int temp2 = array[index - 1];

		int min;
		int max;

		if (temp1 > sayi && temp1 > array[index]) {
			max = temp1;
			min = array[index];
		} else if (temp2 > sayi && temp2 > array[index]) {
			max = temp2;
			min = array[index];
		} else if (temp1 < sayi && temp1 < array[index]) {
			max = array[index];
			min = temp1;
		} else {
			max = array[index];
			min = temp2;
		}

		System.out.println("Girilen sayýdan küçük en yakýn sayý : " + min);
		System.out.println("Girilen sayýdan büyük en yakýn sayý : " + max);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Girilen Sayi: ");
		int sayi = scan.nextInt();

		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

		int nearest1 = findNearestIndex(list, sayi);

		nearestMaxAndMin(list, nearest1, sayi);

	}

}
