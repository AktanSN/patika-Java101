package odevler;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPratik3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		/*
		 * Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in 
		 * kuvvetlerini ekrana yazd�ran program� yaz�yoruz.
		 * */
		
		System.out.print("Sayi gir: ");
		int sayi = scan.nextInt();
		
		for(int i=1,j=1;i<sayi && j<sayi;i*=4,j*=5) {
			System.out.println("4 un kuvveti: "+i+" ||"+" 5 in kuvveti: "+j);
		}

	}

}

