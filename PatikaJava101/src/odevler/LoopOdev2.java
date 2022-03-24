package odevler;

import java.util.Scanner;

public class LoopOdev2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi giriniz: ");
		int sayi=scan.nextInt();
		
		int sum=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0 && sayi!=1) {
				sum+=i;
			}
		}
		
		if(sum == sayi) {
			System.out.println(sayi+" Mükemmel sayidir.");
		}else{
			System.out.println(sayi+" Mükemmel sayi degildir.");
		}
	}

}
