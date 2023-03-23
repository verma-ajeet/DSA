package twoDArray;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SaddlePoint {
	public static void main(String[] args) {
		int[][] arr = {
				{ 15, 12, 11, 14, 15},
				{ 21, 22, 23, 24, 25},
				{ 31, 32, 33, 34, 35},
				{ 41, 42, 43, 44, 45},
				{ 51, 52, 53, 54, 55} };
		for(int r=0;r<arr.length;r++) {
			int column_index=0;
			for(int c=1;c<arr[0].length;c++) {
				if(arr[r][column_index]>arr[r][c]) {
					column_index=c;
				}
			}
			Boolean flag=true;
			for(int row_iteartion=0;row_iteartion<arr.length;row_iteartion++) {
				if(arr[row_iteartion][column_index]>arr[r][column_index]) {
					flag=false;
				}
			}
			if(flag==true) {
				System.out.println(arr[r][column_index]);
				return;
			}
		}
		System.out.println("invalid");
	}
}
