package odevler;

import java.util.Scanner;

public class LoopOdev3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Basamak sayisi girin: ");
		int sayi=scan.nextInt();
		
		for(int i=sayi;i>0;i--) {
			for(int j=sayi-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=2*i-1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
