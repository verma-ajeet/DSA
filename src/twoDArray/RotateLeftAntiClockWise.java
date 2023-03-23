package twoDArray;
public class RotateLeftAntiClockWise {
	static int row_length,col_length;
	public static void main(String[] args) {
		int matrix[][] = new int[][] { 	{ 1, 2, 3 }, 
										{ 4, 5, 6 }, 
										{ 7, 8, 9 } };
		row_length=matrix.length; col_length=matrix[0].length; int k=2;
		displayMatrix(matrix);
	    System.out.println("\nrotated matrix "+k+" times\n");
	    if(row_length!=col_length) {
	    	System.out.println("invalid matrix");
	    } else {
	    	while(k>0) { // for kth rotation
	    		rotateLeft(matrix);
	    		k--;
	    	}
	    }
		displayMatrix(matrix);
	}
	public static void rotateLeft(int[][] arr) {
        int[][] transposeMatrix=convertToTranspose(arr);
//        displayMatrix(arr);
//		System.out.println("\n ROTATE LEFT MATRIX \n");
		int temp=0;
		int last_row=row_length-1;
		for(int r=0;r<row_length/2;r++) {
			for(int c=0;c<col_length;c++) {
				temp=arr[r][c];
				arr[r][c]=arr[last_row][c];
				arr[last_row][c]=temp;
			}
			last_row--;
		}
//		displayMatrix(arr);
	}
	public static int[][] convertToTranspose(int[][] arr){
//		System.out.println("\n TRANSPOSE MATRIX \n");
		int temp=0;
		for(int row=0;row<row_length;row++) {
			for(int col=row;col<col_length;col++) {
				temp=arr[row][col];
				arr[row][col]=arr[col][row];
				arr[col][row]=temp;
			}
		}
		return arr;
	}
	public static void displayMatrix(int[][] arr){
		for(int[] arr1:arr) {
			for(int val:arr1) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}