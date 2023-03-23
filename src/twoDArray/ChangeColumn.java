package twoDArray;

import java.util.Arrays;

public class ChangeColumn {
	public static void main(String[] args) {
		char[][] arr = { 
				{ 'a', 'b', 'c', 'd' }, 
				{ 'e', 'f', 'g', 'h' }, 
				{ 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p' } };
		char temp;
		int lc = arr[0].length - 1;
		for (int c = 0; c < arr[0].length / 2; c++) {
			for (int r = 0; r < arr.length; r++) {
				System.out.println(lc);
				temp = arr[r][c];
				arr[r][c] = arr[r][lc];
				System.out.println("lc= " + lc + " temp " + temp + " arr[lc][r]= " + arr[r][lc] + " ");
				arr[r][lc] = temp;
			}
			lc--;
		}
		for(char[] c:arr) {
			for(char value: c) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
