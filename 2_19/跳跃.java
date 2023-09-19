package 直播2_19;

import java.util.Scanner;

public class 跳跃 {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < m; j++) {
		    	arr[i][j] = scan.nextInt();
		    }
		}
		// 定义状态：dp[i][j] 表示从点（1，1）到点（i，j）的最大权值
	    int[][] dp = new int[n][m];
	    
	    // 规定九个位置的横纵坐标
	    int[] x = {0, 0, 0, -1, -1, -1, -2, -2, -3};
	    int[] y = {-1, -2, -3, 0, -1, -2, 0, -1, 0};
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
		        if (i == 0 && j == 0) {
		            // 初始化
		            dp[i][j] = arr[0][0];
		        } else {
		            for (int k = 0; k < 9; k++) {//到达每一个点的九种可能
		            // 搜索
			            int lastX = i + x[k];
			            int lastY = j + y[k];
			            if (lastX >= 0 && lastX < n && lastY >= 0 && lastY < m) {//判断这个点的坐标是否合法
			                dp[i][j] = Math.max(dp[i][j], dp[lastX][lastY] + arr[i][j]);
			            }
		            }
		        }
	        }
	    }
		System.out.println(dp[n - 1][m - 1]);
    }
}