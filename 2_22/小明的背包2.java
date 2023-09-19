package 直播2_22;

import java.util.Arrays;
import java.util.Scanner;

public class 小明的背包2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int v = scan.nextInt();
        int dp[][] = new int[n+1][v+1];
        int w[] = new int[n+1];
        int p[] = new int[n+1];
        for(int i = 1 ; i <=n;i++) {
            w[i] = scan.nextInt();
            p[i] = scan.nextInt();
        }
        for(int i =1; i <= n; i++) {
            for(int j =1; j <=v; j++) {
                if(w[i]<=j) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-w[i]]+p[i]);//直接考虑还能放多少价值
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[n][v]);
    }
}