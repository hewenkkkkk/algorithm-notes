package 2_22;

import java.util.Scanner;

public class С���ı���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();//��Ʒ����
		int m = sc.nextInt();//����������
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++) {
			w[i] = sc.nextInt();//���
			v[i] = sc.nextInt();//��ֵ
		}
		int[][] dp = new int[n+1][m+1];//1 ~ n
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 || j==0)
					dp[i][j] = 0;
				else {
					if(j<w[i]) {
						dp[i][j] = dp[i-1][j];
					}else {//j>=w[i]
						dp[i][j] = Math.max(dp[i-1][j], v[i]+dp[i-1][j-w[i]]);	
					}
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}
