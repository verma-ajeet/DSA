package twoDArray;
public class RotateMatrixBy90 {
	public static final String ANSI_RED = "\u001B[31m";
	public static void main(String[] args) {
		char[][] arr = { 
				{ 'a', 'b','x', 'c', 'd' },
				{ 'e', 'f', 'y','g', 'h' },
				{ 'i', 'j', 'z','k', 'l' },
				{ 'm', 'n', 'q','o', 'p' }
				};
		displayMatrix(arr);
		if (arr.length==arr[0].length) {
			System.out.println("\nTRANSPOSE MATRIX\n");
			char[][] transposeMatrix = convertToTransposeMatrix(arr);
			displayMatrix(transposeMatrix);
			System.out.println("\n90 DEGREE ROTATED MATRIX\n");
			char[][] rotateTo90degree = rotateTo90Degree(transposeMatrix);
			displayMatrix(rotateTo90degree);
		}else {
			System.out.println(ANSI_RED+"Matrix does not have equal dimensions. Therefore rotation is not possible");
		}
	}
	public static char[][] convertToTransposeMatrix(char[][] arr) {
		char temp;
		for (int r = 0; r < arr.length; r++) {
			for (int c = r + 1; c < arr[0].length; c++) {
				temp = arr[r][c];
				arr[r][c] = arr[c][r];
//				System.out.println("temp= " + temp + " arr[r][c]= " + arr[r][c] + " c=" + c + " r= " + r);
				arr[c][r] = temp;
//	    		   System.out.println(Arrays.toString(arr[0]));
			}
		}
		return arr;
	}
	public static char[][] rotateTo90Degree(char[][] arr){
		int last_col=arr[0].length-1;
		char temp;
		for(int col=0;col<arr[0].length/2;col++) {
			for(int row=0;row<arr.length;row++) {
				temp=arr[row][col];
				arr[row][col]=arr[row][last_col];
//				System.out.println("temp= "+ temp + " arr[row][col]= " + arr[row][col]);
				arr[row][last_col]=temp;
			}
			last_col--;
		}
		return arr;
	}
	public static void displayMatrix(char[][] arr) {
		for (char[] arr2 : arr) {
			for (char val : arr2)
				System.out.print(val+" ");
			System.out.println();
		}
	}
}