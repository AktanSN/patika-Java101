package odevler;

import java.util.Scanner;

public class LoopPratik8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N sayisi girin: ");
		int n= scan.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>0;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=2*i-1;k>0;k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}


}
