package 直播3_8;

import java.util.Arrays;
import java.util.Scanner;

public class 石子合并 {

    static int max = 0x3f3f3f3f;
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            int n = sc.nextInt();
            //石子数组
            int[] num = new int[n+1];
            //石子堆数组
            int[] sum = new int[n+1];
            //记忆化数组,用来记录总的代价
            int[][] dp = new int[n+1][n+1];
            //dp数组初始化
            for(int i=0;i<=n;i++) {
                Arrays.fill(dp[i],max);//dp[1][4]
            }
            sum[0] = 0;
            //sum数组初始化
            for(int i=1;i<=n;i++) {
                num[i] = sc.nextInt();
                sum[i] = num[i] + sum[i-1];
                dp[i][i] = 0;
            }
            //第一层len代表区间长度
            for(int len=1; len<n; len++) {
                //第二层i代表区间开头
                for(int i=1; i+len<=n; i++) {
                    int j = i+len;
                    //第三层k代表区间分割的位置
                    for(int k=i; k<j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+sum[j]-sum[i-1]);
                    }
                }
            }
            //即代表1-n石子的最小代价
            System.out.println(dp[1][n]);
        }
    }
    
}