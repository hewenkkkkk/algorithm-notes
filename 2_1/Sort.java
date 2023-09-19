package 2_1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[10];
		for(int i=1;i<=10;i++) {
			n[i-1] = 10-i;//9 8 7 6 
		}
		//Arrays.sort(n,0,4);
		Arrays.sort(n,5,9);
		System.out.println(Arrays.toString(n));
	}

}
