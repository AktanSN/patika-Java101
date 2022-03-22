package odevler;

import java.util.Scanner;

public class LoopPratik6 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi giriniz: ");
		int sayi = scan.nextInt();
		
		int temp = sayi;
		int basamak;
		int sum=0;
		
		while(temp!=0) {
			basamak = temp%10;
			sum+=basamak;
			temp/=10;
		}
		
		System.out.println(sayi + " basamak sayýlarý toplamý: " + sum);
		
		
		
	}

}
