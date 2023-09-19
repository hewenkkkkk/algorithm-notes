package 直播2_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 背包与魔法{

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int[] w = new int[n+1];
        int[] v = new int[n+1];
        for(int i=1;i<=n;i++){
            s = in.readLine().split(" ");
            w[i] = Integer.parseInt(s[0]);
            v[i] = Integer.parseInt(s[1]);
        }
        int[][] dp = new int[m+1][2];
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >=w[i]; j--) {
                dp[j][0]=Math.max(dp[j-w[i]][0]+v[i],dp[j][0]);//没有用魔法
                if (w[i]+k<=j){//这件商品用了魔法，还能放得下
                    dp[j][1]= (int) Math.max(Math.max(dp[j][1],dp[j-w[i]][1]+v[i]),dp[j-(w[i]+k)][0]+v[i]* 2);
                }
            }
        }
        out.println(Math.max(dp[m][1],dp[m][0]));
        out.flush();
    }
}