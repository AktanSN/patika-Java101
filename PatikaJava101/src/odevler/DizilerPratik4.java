package odevler;

import java.util.Arrays;

public class DizilerPratik4 {

	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[] array = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 2, 4, 4, 8, 8, 1, 1 };
		int[] dublicate = new int[array.length];

		int startIndex = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && array[i] % 2 == 0) {
					if (!isFind(dublicate, array[i])) {
						dublicate[startIndex++] = array[i];
					}

				}
			}
		}

		for (int i : dublicate) {
			if (!(i == 0)) {
				System.out.println(i);
			}
		}

	}

}
