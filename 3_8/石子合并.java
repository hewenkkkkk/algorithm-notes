package ֱ��3_8;

import java.util.Arrays;
import java.util.Scanner;

public class ʯ�Ӻϲ� {

    static int max = 0x3f3f3f3f;
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            int n = sc.nextInt();
            //ʯ������
            int[] num = new int[n+1];
            //ʯ�Ӷ�����
            int[] sum = new int[n+1];
            //���仯����,������¼�ܵĴ���
            int[][] dp = new int[n+1][n+1];
            //dp�����ʼ��
            for(int i=0;i<=n;i++) {
                Arrays.fill(dp[i],max);//dp[1][4]
            }
            sum[0] = 0;
            //sum�����ʼ��
            for(int i=1;i<=n;i++) {
                num[i] = sc.nextInt();
                sum[i] = num[i] + sum[i-1];
                dp[i][i] = 0;
            }
            //��һ��len�������䳤��
            for(int len=1; len<n; len++) {
                //�ڶ���i�������俪ͷ
                for(int i=1; i+len<=n; i++) {
                    int j = i+len;
                    //������k��������ָ��λ��
                    for(int k=i; k<j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+sum[j]-sum[i-1]);
                    }
                }
            }
            //������1-nʯ�ӵ���С����
            System.out.println(dp[1][n]);
        }
    }
    
}