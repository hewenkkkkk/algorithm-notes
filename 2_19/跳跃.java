package ֱ��2_19;

import java.util.Scanner;

public class ��Ծ {
	
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
		// ����״̬��dp[i][j] ��ʾ�ӵ㣨1��1�����㣨i��j�������Ȩֵ
	    int[][] dp = new int[n][m];
	    
	    // �涨�Ÿ�λ�õĺ�������
	    int[] x = {0, 0, 0, -1, -1, -1, -2, -2, -3};
	    int[] y = {-1, -2, -3, 0, -1, -2, 0, -1, 0};
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
		        if (i == 0 && j == 0) {
		            // ��ʼ��
		            dp[i][j] = arr[0][0];
		        } else {
		            for (int k = 0; k < 9; k++) {//����ÿһ����ľ��ֿ���
		            // ����
			            int lastX = i + x[k];
			            int lastY = j + y[k];
			            if (lastX >= 0 && lastX < n && lastY >= 0 && lastY < m) {//�ж������������Ƿ�Ϸ�
			                dp[i][j] = Math.max(dp[i][j], dp[lastX][lastY] + arr[i][j]);
			            }
		            }
		        }
	        }
	    }
		System.out.println(dp[n - 1][m - 1]);
    }
}