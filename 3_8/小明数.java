package 3_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 小明数 {
	
	static int[][] f = new int[11][10];
	static int k;
	public static void main(String[] args) throws IOException {
		StreamTokenizer sc=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	    sc.nextToken();
		int t = (int)sc.nval;
		while(t> 0) {
			t--;
			sc.nextToken();
			k = (int)sc.nval;
			sc.nextToken();
			int l = (int)sc.nval;
			sc.nextToken();
			int r = (int)sc.nval;
			for (int i = 0; i < 11; i++) {
				Arrays.fill(f[i], 0);
			}
			init();
			System.out.println(dp(r) - dp(l - 1));
		}
		return;
	}
	private static int dp(int num) {
		if(num == 0) {
			return 0;
		}
		int res = 0;
		int last = 0;//上一个位数的数字
		int[] nu = new int[12];
		int n = 1;
		while (num > 0 ) {
			nu[n++] = num%10;
			num = num / 10;
		}
		n--;
		for (int i = n; i > 0; i--) {//遍历位数
			int x = nu[i];
			int jj;
			if(i == n) {
				jj = 1;
			}else {
				jj = 0;
			}
			for (; jj < x; jj++) {//遍历该位数上可以填的数字
			
				if(Math.abs(jj - last) <= k || i == n) {
					//System.out.println("mm" + i);
					res += f[i][jj];
				}
			}
			if(Math.abs(x-last) <= k || i == n) {
				last = x;
			}else {
				break;
			}
			if(i==1) {
				res++;
			}
		}
		//加包含前导0的，其实就是加上不是和num同位数的数字，
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < 10; j++) {//从1开始
				res += f[i][j];
			}
		}
		return res;
	}
	private static void init() {
		for (int i = 0; i < 10; i++) {//初始化只有一位数字的时候，一定符合要求
			 f[1][i] = 1;//注意i一定从0开始
		}
		for (int i = 2; i < 10; i++) {//初始化其它位数的数字
			for (int j = 0; j < 10; j++) {//注意，这里可以包含0
				for (int m = 0; m < 10; m++) {
					if(Math.abs(m-j) <= k) {
						f[i][j] += f[i-1][m];
					}
				}
			}
		}
	}
}