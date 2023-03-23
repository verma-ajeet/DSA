package twoDArray;

public class Print2Darray {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 2 }, { 6, 4, 1 } };
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
				if (col == arr[0].length-1) {
					System.out.println();
				}
			}
		}
	}
}
