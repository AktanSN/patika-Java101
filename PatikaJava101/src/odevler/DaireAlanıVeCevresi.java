package odevler;

import java.util.Scanner;

public class DaireAlan�VeCevresi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dairenin Yar��ap�n� Girin: ");
		double yaricap = scan.nextDouble();
		
		double alan = Math.PI * yaricap * yaricap;
		double cevre = 2 * Math.PI * yaricap;
		
		System.out.println("Dairenin alan�: "+ alan);
		System.out.println("Dairenin cevresi "+ cevre);
		
		System.out.print("Dilim alan� bulunmas� istenen dairenin merkez a�� �l��s�: ");
		double merkezAc� = scan.nextDouble();
		
		double dilimAlan = (Math.PI*(yaricap*yaricap)*merkezAc�)/360;
		System.out.println("Dilim alan: "+ dilimAlan);
		
		

	}

}
