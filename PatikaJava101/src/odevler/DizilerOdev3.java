package odevler;

public class DizilerOdev3 {

	public static void main(String[] args) {
		int[][] dizi = {{2,3,4},{5,6,4}};

		int[][] transpoz = new int[dizi[0].length][dizi.length];
		
		for(int i=0;i<dizi.length;i++) {
			for(int j=0;j<dizi[i].length;j++) {
				transpoz[j][i] = dizi[i][j];
			}
		}
		System.out.println("Matris :");
		for(int[] row:dizi) {
			for(int col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpoze :");
		for(int[] row:transpoz) {
			for(int col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
