package Array;
import java.util.Arrays;
public class RotateArray {
	public static void main(String[] args) {
		String str = "abcdefgh";// fghabcde  
		// part1 -> abcde part2 -> fgh
		char[] arr = str.toCharArray();
		int len = str.length();
		int rotations = 3;
		if (len == rotations && rotations % len == 0) {
			System.out.println(Arrays.toString(arr));
		}
		else if(rotations<0) { // if rotation -ve then add it to arr.length
			rotations=rotations+len;
			reverse(0, arr.length - rotations - 1, arr);  // part1 reverse
			reverse(arr.length - rotations, arr.length - 1, arr); // part2 reverse
			reverse(0, len - 1, arr); // reverse entire array to get result
		}
		else if(rotations>len) {// if rotation = 101 then (101%arr.length)=rotations
			rotations=rotations%len;
			reverse(0, arr.length - rotations - 1, arr);
			reverse(arr.length - rotations, arr.length - 1, arr);
			reverse(0, len - 1, arr);
		}
	}
	private static void reverse(int start, int end, char[] arr) {
		int low_index = start;
		int end_index = end;
		while (low_index < end_index) {
			char temp = arr[low_index];
			arr[low_index] = arr[end_index];
			arr[end_index] = temp;
			low_index++;
			end_index--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
