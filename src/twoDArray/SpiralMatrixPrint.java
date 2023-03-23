package twoDArray;

public class SpiralMatrixPrint {
	public static void main(String[] args) {
		int[][] arr = {
				{ 11, 12, 13, 14, 15, 16, 17 },
				{ 21, 22, 23, 24, 25, 26, 27 },
				{ 31, 32, 33, 34, 35, 36, 37 },
				{ 41, 42, 43, 44, 45, 46, 47 },
				{ 51, 52, 53, 54, 55, 56, 57 } };
		int min_row = 0;
		int min_col = 0;
		int max_row = arr.length - 1;
		int max_col = arr[0].length - 1;
		int total_no_of_elements = arr.length*arr[0].length;
		int count=0;
		while (count<total_no_of_elements) {
			for (int r = min_row,j=min_col; r <= max_row && count<total_no_of_elements; r++) {
				System.out.print(arr[r][j] + " ");
				count++;
			}
			min_col++;
			System.out.println();
			for (int c = min_col,j=max_row; c <=max_col && count<total_no_of_elements ; c++) {
				System.out.print(arr[j][c] + " ");
				count++;
			}
			max_row--;
			System.out.println();
			for (int r = max_row,j=max_col; r >= min_row && count<total_no_of_elements; r--) {
				System.out.print(arr[r][j] + " ");
				count++;
			}
			max_col--;
			System.out.println();
			for (int c = max_col,j=min_row; c >=min_col && count<total_no_of_elements; c--) {
				System.out.print(arr[j][c] + " ");
				count++;
			}
			min_row++;
			System.out.println();
		}
	}
}
