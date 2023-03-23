package twoDArray;

import java.net.Socket;

public class ExitPointMatrix {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 0, 0, 1, 0 },
				{ 1, 0, 0, 1 },
				{ 0, 0, 0, 1 },
				{ 1, 0, 1, 0 }, };
		int dir = 0;
		int r = 0;
		int c = 0;
		while (true) {
			dir = (dir + arr[r][c]) % 4;
			if (dir == 0) {
				c++;
			} else if (dir == 1) {
				r++;
			} else if (dir == 2) {
				c--;
			} else if (dir == 3) {
				r--;
			}
//			System.out.println("dir= "+dir+" c= "+c+ " r= "+r);
			if(r<0) {
				r++;
				break;
			}else if(c<0) {
				c++;
				break;
			}else if (r==arr.length) {
				r--;
				break;
			}else if(c==arr[0].length) {
				c--;
				break;
			}
		}
		System.out.println("row= "+r+" col= "+c);
	}
}
