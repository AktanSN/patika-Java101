package odevler;


import java.util.Scanner;

public class DizilerPratik2 {
	// �ncelikle diziyi s�ral�yoruz
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

	// s�ralanan dizide girilen say�ya en yak�n dizi indexini buluyoruz
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

	//buldu�umuz en yak�n indexten bir �nce ve bir sonraki indexteki de�erlere bakarak
	//en yak�n index in en yak�n en b�y�k m� yoksa en yak�n en k���k m� oldu�una karar veriyoruz.
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

		System.out.println("Girilen say�dan k���k en yak�n say� : " + min);
		System.out.println("Girilen say�dan b�y�k en yak�n say� : " + max);

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
