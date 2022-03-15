package odevler;

import java.util.Scanner;

public class DaireAlanýVeCevresi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dairenin Yarýçapýný Girin: ");
		double yaricap = scan.nextDouble();
		
		double alan = Math.PI * yaricap * yaricap;
		double cevre = 2 * Math.PI * yaricap;
		
		System.out.println("Dairenin alaný: "+ alan);
		System.out.println("Dairenin cevresi "+ cevre);
		
		System.out.print("Dilim alaný bulunmasý istenen dairenin merkez açý ölçüsü: ");
		double merkezAcý = scan.nextDouble();
		
		double dilimAlan = (Math.PI*(yaricap*yaricap)*merkezAcý)/360;
		System.out.println("Dilim alan: "+ dilimAlan);
		
		

	}

}
