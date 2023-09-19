package 2_22;

import java.util.Scanner;

public class 小明的背包1优化 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		int[] dp = new int[m+1];
		for(int i=0;i<n+1;i++){
			for(int j=m;j>=w[i];j--){
				dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]);
			}
		}
		System.out.println(dp[m]);
	}
}
