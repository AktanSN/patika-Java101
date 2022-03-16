package odevler;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner. 
		 * S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner. 
		 * S�cakl�k 15 ve 25 aras�nda ise "Piknik"etkinli�ini �ner. 
		 * S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.
		 */

		int sicaklik;

		System.out.print("S�cakl�k giriniz: ");
		sicaklik = scan.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Kayak yapabilirsin");
		}else if(5>=sicaklik && sicaklik<=15) {
			System.out.println("Sinemaya gidebilirsin");
		}else if(sicaklik>15 && sicaklik<=25) {
			System.out.println("Pikni�e gidebilirsin");
		}else {
			System.out.println("Y�zmeye gidebilirsin");
		}
	}

}
