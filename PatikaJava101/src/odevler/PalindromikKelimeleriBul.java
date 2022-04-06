package odevler;

import java.util.Scanner;

public class PalindromikKelimeleriBul {
	
	static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kelime giriniz: ");
		String kelime = scan.nextLine();
		
		if(isPalindrome(kelime)) {
			System.out.println(kelime + " Palindromik kelimedir");
		}else {
			System.out.println(kelime + " Palindromik kelime DEGILDIR");
		}
	}
}
