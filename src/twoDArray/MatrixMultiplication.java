package twoDArray;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] arr1 = { 
				{ 1, 1, 1 }, 
				{ 0, 5, 2 }, 
				{ 6, 4, 0 } };
		int[][] arr2 = { 
				{ 1, 1, 1 }, 
				{ 4, 0, 2 }, 
				{ 6, 4, 1 } };
		multiplyMatrix(arr1, arr2);
	}

	private static void multiplyMatrix(int[][] arr1, int[][] arr2) {
		if (arr1[0].length != arr2.length) {
			System.out.println("invalid matrix");
		} else {
			int[][] result = new int[arr1[0].length][arr2.length];
			for (int r = 0; r < result.length; r++) {
				for (int c = 0; c < result[r].length; c++) {
					for (int k = 0; k < arr2.length; k++) {
						result[r][c] += arr1[r][k] * arr2[k][c];
					}
				}
			}
			for (int r = 0; r < result.length; r++) {
				for (int c = 0; c < result[r].length; c++) {
					System.out.print(result[r][c]+ " ");
				}
				System.out.println();
			}
		}
	}
}
