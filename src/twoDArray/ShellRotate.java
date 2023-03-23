package twoDArray;
import java.util.Arrays;
//Steps //1-> get all the elements into 1d array 
//2-> shift the elements in 1d array as per the shift
//3-> push all the elements back to 2d array from 1d array
public class ShellRotate {
	static int shell = 2;
	public static void main(String[] args) {
		int[][] arr = {
				{ 11, 12, 13, 14, 15, 16, 17 },
				{ 21, 22, 23, 24, 25, 26, 27 },
				{ 31, 32, 33, 34, 35, 36, 37 },
				{ 41, 42, 43, 44, 45, 46, 47 },
				{ 51, 52, 53, 54, 55, 56, 57 } };
		int shift = 2;
		int[] get1dArray = get1DArray(arr, shell);
		System.out.println("orginal: "+Arrays.toString(get1dArray));
		int[] reverse_or_shifted_array = reverse_or_shift(get1dArray, shift);
		System.out.println("reverse: "+Arrays.toString(reverse_or_shifted_array));
		put_1d_Arrya_back_in_matrix(get1dArray, arr);
		displayMatrix(arr);
	}
	public static int[] get1DArray(int[][] arr, int shell) {
		int minr = shell - 1, minc = shell - 1, maxr = arr.length - shell, maxc = arr[0].length - shell;
		int lw = maxr - minr;
		int bw = maxc - minc;
		int shell_size = 2 * lw + 2 * bw;
		int[] oneDArray = new int[shell_size];
		int idx = 0;
		for (int r = minr, c = minc; r <= maxr; r++) {
			oneDArray[idx] = arr[r][c];
			idx++;
		}
		minc++;
		for (int r = maxr, c = minc; c <= maxc; c++) {
			oneDArray[idx] = arr[r][c];
			idx++;
		}
		maxr--;
		for (int r = maxr, c = maxc; r >= minr; r--) {
			oneDArray[idx] = arr[r][c];
			idx++;
		}
		maxc--;
		for (int r = minr, c = maxc; c >= minc; c--) {
			oneDArray[idx] = arr[r][c];
			idx++;
		}
		minr++;
		return oneDArray;
	}
	public static int[] reverse_or_shift(int[] arr, int shift) {
		int arr_length = arr.length;
		if (shift == arr.length && shift % arr_length == 0) {
			return arr;
		} else if (shift < 0) {
			shift = shift + arr_length;
		} else if (shift > arr_length) {
			shift = shift % arr_length;
		}
		reverse(0, arr_length - shift - 1, arr);
		reverse(arr_length-shift, arr_length - 1, arr);
		reverse(0, arr_length-1, arr);			
		return arr;
	}
	private static void reverse(int start, int end, int[] arr) {
		int li = start,hi = end;
		while (li < hi) {
			int temp = arr[li];
			arr[li] = arr[hi];
			arr[hi] = temp;
			li++;
			hi--;
		}
	}
	private static int[][] put_1d_Arrya_back_in_matrix(int[] oneDArray,int[][] arr) {
		int minr = shell - 1, minc = shell - 1, maxr = arr.length - shell, maxc = arr[0].length - shell;
		int idx = 0;
		for (int r = minr, c = minc; r <= maxr; r++) {
			 arr[r][c]=oneDArray[idx];
			idx++;
		}
		minc++;
		for (int r = maxr, c = minc; c <= maxc; c++) {
			arr[r][c]=oneDArray[idx];
			idx++;
		}
		maxr--;
		for (int r = maxr, c = maxc; r >= minr; r--) {
			arr[r][c]=oneDArray[idx];
			idx++;
		}
		maxc--;
		for (int r = minr, c = maxc; c >= minc; c--) {
			arr[r][c]=oneDArray[idx];
			idx++;
		}
		minr++;
		return arr;
	}
	public static void displayMatrix(int[][] arr) {
		for(int[] arr1:arr) {
			for(int val : arr1) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}