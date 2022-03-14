package odevler;

import java.util.Scanner;

public class HipotenusBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		System.out.print("ilk dik kenarý girin: ");
		int ilkDik = scan.nextInt();
		
		System.out.print("ikinci dik kenarý girin: ");
		int ikinciDik = scan.nextInt();
		
		double hipotenus = Math.pow((ilkDik * ilkDik + ikinciDik * ikinciDik),0.5);
		
		double ucgenAlan = (ilkDik * ikinciDik) /2;
		
		System.out.println("Hipotenus: "+ hipotenus);
		System.out.println("Ucgenin Alaný: "+ ucgenAlan);
		
	}

}
