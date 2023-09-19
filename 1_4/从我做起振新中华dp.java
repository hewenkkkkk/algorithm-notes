package 直播1_4;

public class 从我做起振新中华dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dp[i][j] = dp[i-1][j] + dp[i][j-1];
		int[][] dp = new int[4][5];
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				if(i==0 && j==0) {
					dp[i][j] = 1;
					continue;
				}
				if(i==0) {
					dp[i][j] = dp[i][j-1];
				}
				if(j==0) {
					dp[i][j] = dp[i-1][j];
				}
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		System.out.println(dp[3][4]);
	}

}
