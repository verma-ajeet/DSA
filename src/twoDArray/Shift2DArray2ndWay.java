package twoDArray;
import java.util.ArrayList;
import java.util.List;

public class Shift2DArray2ndWay {
	public static void main(String[] args) {
		int[][] arr = {
				{ 11, 12, 13, 14},           //     [41, 42, 43, 44]
				{ 21, 22, 23, 24},           //     [51, 52, 53, 54]
				{ 31, 32, 33, 34},           // ->  [11, 12, 13, 14]
				{ 41, 42, 43, 44},           //     [21, 22, 23, 24]
				{ 51, 52, 53, 54} };         //     [31, 32, 33, 34]
		int shift=8;
		int row_length=arr.length;
		int col_length=arr[0].length;                                               //ix c r v
		int total_element=row_length*col_length;                                    //12 3 0 41
		shift=shift%total_element;                                                  //13 3 1 42                               
		int[][] re=new int[row_length][col_length];                                 //14 3 2 43
		List<List<Integer>> result = new ArrayList<List<Integer>>();								//15 3 3 44
		System.out.println("ix c r v"); // index col row value											//16 4 0 51
		for(int r=0;r<row_length;r++) {																							//17 4 1 52
			List<Integer> subList =new ArrayList<Integer>();													//18 4 2 53
			for(int c=0;c<col_length;c++) {																						//19 4 3 54
				//3rd way																																//0 0 0 11
//              int x2 = (r+ (c+shift)/col_length) % row_length;                //1 0 1 12
//				int y2 = (c+shift)%col_length ;                                       //2 0 2 13
//				System.out.println("row= "+x2+" col= "+y2);                           //3 0 3 14
//				re[x2][y2] = arr[r][c];                                               //4 1 0 21
				int idx=findShiftedIndex(r,c,row_length,col_length,total_element,shift);//5 1 1 22
				System.out.println(idx+" "+idx/col_length+" "+idx%col_length+           //6 1 2 23
						" "+arr[idx/col_length][idx%col_length]);                           //7 1 3 24
				subList.add(arr[idx/col_length][idx%col_length]);                       //8 2 0 31
			}                                                                         //9 2 1 32
			result.add(subList);                                                      //10 2 2 33
		}                                                                           //11 2 3 34
//		for(int[] re_arr:re) {
//			System.out.println(Arrays.toString(re_arr));
//		}
		System.out.println();
		for(List<Integer> data:result ) {
			System.out.println(data);
		}
	}

	private static int findShiftedIndex(int row_idx, int col_idx,int row_len,int col_len, int total_element, int shift) {
		int index=(row_idx*col_len+col_idx+total_element-shift)%total_element;
		return index;
	}
}