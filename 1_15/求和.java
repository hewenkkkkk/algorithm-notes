package 直播1_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 求和 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		int[] num = new int[n];
		String[] s = in.readLine().split(" ");
		long sum = 0;//前缀和
		long ans = 0;//结果
		for(int i=0;i<n;i++) {//O(n)  O(n*n)
			//2e5   4e10
			num[i] = Integer.parseInt(s[i]);//1 3 6 9
			ans = ans + sum * num[i];//0 3 24 90
			sum = sum + num[i];//1 4 10 19
		}
		System.out.println(ans);
		/** 1 2 3 4 5
			12 13 14 15
		 +	23 24 25
		 +	34 35
		 +  45
		 (0)1 + (1)3 + (1+3)6 + (1+3+6)9   累加(第i项*前i-1项的和)
		 * */
 	}
}
