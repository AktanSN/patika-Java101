package odevler;

import java.util.Scanner;

public class LoopPratik7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N sayisi gini: ");
		int n = scan.nextInt();
		
		double result=0;
		
		for(int i=1;i<=n;i++) {
			result += (1.0/i);
		}
		
		System.out.println("Harmonik formul sonuc: "+ result);
	}

}
