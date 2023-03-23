package twoDArray;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
public static void main(String[] args) {
	int[][] arr = {
			{ 11, 12, 13, 14, 15, 16, 17 },
			{ 21, 22, 23, 24, 25, 26, 27 },
			{ 31, 32, 33, 34, 35, 36, 37 },
			{ 41, 42, 43, 44, 45, 46, 47 },
			{ 51, 52, 53, 54, 55, 56, 57 } };
	List<int[]> shiftGrid = shiftGrid(arr, 2);
	for(int[] arrr:shiftGrid) {
		for(Integer val : arrr) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
}
public static List<int[]> shiftGrid(int[][] grid, int k) {
    int row=grid.length,col=grid[0].length;
            k%=(row*col);
    int[][] ans=new int[row][col];
    for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
            int nrow=r,ncol=c+k;
            if(ncol>=col){
                nrow+=ncol/col;

                if(nrow>=row){
                    nrow%=row;
                }
                ncol%=col;
            }
            ans[nrow][ncol]=grid[r][c];
        }
    }
    return Arrays.asList(ans);
}
}

//56 57 11 12 13 14 15 
//16 17 21 22 23 24 25 
//26 27 31 32 33 34 35 
//36 37 41 42 43 44 45 
//46 47 51 52 53 54 55 

