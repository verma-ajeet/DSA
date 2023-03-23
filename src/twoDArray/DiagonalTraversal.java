package twoDArray;

public class DiagonalTraversal {
	public static void main(String[] args) {
		int[][] arr = {
				{ 11, 12, 13, 14, 15},
				{ 21, 22, 23, 24, 25},
				{ 31, 32, 33, 34, 35},
				{ 41, 42, 43, 44, 45},
				{ 51, 52, 53, 54, 55} };
		for(int gap=0;gap<arr.length;gap++) {
			for(int row=0,col=gap;col<arr.length;row++,col++) {
            	  System.out.print(arr[row][col]+" ");
			}
            System.out.println();
		}
	}
}
