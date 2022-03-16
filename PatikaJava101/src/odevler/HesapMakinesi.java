package odevler;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int num1;
		int num2;
		int select;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Say� giriniz: ");
		num1 = scan.nextInt();
		
		System.out.print("Say� giriniz: ");
		num2 = scan.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("��lem se�iniz:");
		select = scan.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Toplam: " + (num1+num2));
				break;
			case 2:
				System.out.println("��karma: "+ (num1-num2));
				break;
			case 3:
				System.out.println("�arpma: " + (num1*num2));
				break;
			case 4:
				if(num2 != 0) {
					System.out.println("B�lme: " + (num1/num2));
				}else {
					System.out.println("0 ile b�l�nemez");
				}
				break;
			default: 
				System.out.println("Uygun giri� yap�n�z");
		}

	}

}
