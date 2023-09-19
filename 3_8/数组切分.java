package 3_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 数组切分 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
    	int n = Integer.parseInt(in.readLine());
		int[] a = new int[n+1];
		String[] s = in.readLine().split(" ");
		for(int i=1;i<=n;i++)
			a[i] = Integer.parseInt(s[i-1]);
		long[] dp = new long[n+1];//以n结尾
		dp[0] = 1;
		for(int i=1;i<=n;++i){
			int ma=a[i],mi=a[i];//定义最大最小值
			for(int j=i;j>=1;j--){
				ma = Math.max(ma, a[j]);
				mi = Math.min(mi, a[j]);
				if(ma-mi == i-j) {
					dp[i] = (dp[i] + dp[j-1]) % 1000000007;
				}
			}
		}
		System.out.println(dp[n]);
	}

}
