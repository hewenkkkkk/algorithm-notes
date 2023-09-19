package 2_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 最长公共子序列 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int N = (int)1e8;
	public static void main(String[] args) throws IOException{
		String x = in.readLine();
		char[] s = x.substring(0,x.length()-1).toCharArray();
		x = in.readLine();
		char[] t = x.substring(0,x.length()-1).toCharArray();
		int[][] dp = new int[s.length+1][t.length+1];//长度
		int[][] num = new int[s.length+1][t.length+1];//个数
		for(int i=0;i<s.length;i++) num[i][0] = 1;
		for(int i=0;i<t.length;i++) num[0][i] = 1;
		for(int i=1;i<=s.length;i++) {
			for(int j=1;j<=t.length;j++) {
				if(s[i-1]==t[j-1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
					num[i][j] = num[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				if(dp[i][j]==dp[i][j-1])
					num[i][j] = num[i][j] + num[i][j-1];
				if(dp[i][j]==dp[i-1][j])
					num[i][j] = num[i][j] + num[i-1][j];
				if(dp[i][j]==dp[i-1][j-1])
					num[i][j] = num[i][j] - num[i-1][j-1];
				num[i][j] %= N;
			}
		}
		System.out.println(dp[s.length][t.length]);
		System.out.println(num[s.length][t.length]);
	}
}
