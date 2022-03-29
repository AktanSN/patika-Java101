package odevler;

public class DizilerOdev2 {

	static boolean isRepeated(int[] dublicated,int value) {
		
		for(int i: dublicated) {
			if(i == value) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
		int[] dublicated = new int[array.length];
		
		int count= 0;
		int startIndex=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
			
			if(!isRepeated(dublicated, array[i])) {
				dublicated[startIndex++] = array[i];
				System.out.println(array[i]+ " sayisi "+ count+ " kere tekrar edildi.");
			}
			count=0;
			
		}
				
	}

}
