package twoDArray;
// starting from two right corner, coming down check if greater or not
// if greater move towards left in that column,
// if not greater move downwards in that row.
public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 15, 12, 11, 14, 15 },
				{ 21, 22, 23, 24, 25 },
				{ 31, 32, 33, 34, 35 },
				{ 41, 42, 43, 44, 45 },
				{ 51, 52, 53, 54, 55 } };
		int search=42;
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>0) {
        	if(search==arr[row][col]) {
        		System.out.println("row: "+row+" col: "+col +" value: "+arr[row][col]);
        		return;
        	}
        	else if(arr[row][col]>search) {
        		// if value in matrix greater than search value move left in the column
        		col--;
        	}else {
        		// else move towards down in the row
        		row++;
        	}
        }
	}
}
