package odevler;

import java.util.Scanner;

public class PratikMetot2 {
	
	static int fib(int sayi) {
		
		if(sayi==1 || sayi ==2) {
			return 1;
		}
		
		return fib(sayi-1)+fib(sayi-2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Gir: ");
		int sayi = scan.nextInt();
		
		int i=sayi;
		while(i>0) {
			System.out.println(i+". adým: "+fib(i));
			i--;
		}
	}

}
