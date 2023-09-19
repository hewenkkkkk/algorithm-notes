package 3_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class 蓝桥舞会 {
	static ArrayList<Integer>[] q;//上司的下属有些谁
	static boolean[] visit;//判断这个人是不是没有上司的
	static long[][] dp;
	static int[] a;
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		a = new int[n + 1];
	    q = new ArrayList[n+1];
		dp = new long[n + 1][2]; 
		visit = new boolean[n + 1];
		String[] s = in.readLine().split(" ");
		for(int i=1;i<=n;i++) {
			a[i] = Integer.parseInt(s[i-1]);
			q[i] = new ArrayList<>();
		}
		for(int i=1;i<n;i++) {
			s = in.readLine().split(" ");
			int u = Integer.parseInt(s[0]);
			int v = Integer.parseInt(s[1]);
			visit[u] = true;
			q[v].add(u);//u是v的下属
		}
		int root = -1;
		for(int i=1;i<=n;i++) {
			if(!visit[i]) {
				root = i;
				break;
			}
		}
		dfs(root);
		System.out.println(Math.max(dp[root][1], dp[root][0]));
	}
	static void dfs(int root) {
		dp[root][1] += a[root];
		for (int i = 0; i < q[root].size(); i++) {
			int to = q[root].get(i); 
			dfs(to);
			dp[root][1] += dp[to][0];
			dp[root][0] += Math.max(dp[to][0], dp[to][1]);
		}
	}
}
