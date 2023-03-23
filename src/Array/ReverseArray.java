package Array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr, arr.length);
		reverse(0, arr.length-1,arr);
	}

	//1st way
	private static void reverse(int[] arr, int length) {
		int temp=0;
		int arr_len=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[arr_len];
			arr[arr_len]=temp;
			arr_len--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	// 2nd way
	private static void reverse(int start, int end, int[] arr) {
		int low_index = start;
		int end_index = end;
		while (low_index < end_index) {
			int temp = arr[low_index];
			arr[low_index] = arr[end_index];
			arr[end_index] = temp;
			low_index++;
			end_index--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
