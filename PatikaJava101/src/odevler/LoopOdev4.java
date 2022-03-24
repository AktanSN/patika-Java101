package odevler;

public class LoopOdev4 {

	public static void main(String[] args) {

		int flag = 0;
		for (int i = 2; i <= 100; i++) {
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					flag = 1;
				}
			}
			if (flag != 1) {
				System.out.print(i + " ");
			}
			flag = 0;

		}

	}

}
