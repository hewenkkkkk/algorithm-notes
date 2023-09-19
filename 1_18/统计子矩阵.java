package ֱ��1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ͳ���Ӿ��� {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		long[][] sum = new long[n+1][m+1];//�����ǰ׺������(1,1)~(i,j)
		long k = Long.parseLong(s[2]);
		for(int i=1;i<=n;i++) {
			s = in.readLine().split(" ");
			for(int j=1;j<=m;j++) {
				sum[i][j] = sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+Integer.parseInt(s[j-1]);
			}
		}
		long ans = 0;//ͳ�Ƹ���
		for(int h1=1;h1<=n;h1++){//�ϱ߽�
	        for(int h2=h1;h2<=n;h2++){//�±߽�
	            for(int l=1,r=1;r<=m;r++){//�ұ߽�
	                while(r>=l && (sum[h2][r]-sum[h1-1][r]-sum[h2][l-1]+sum[h1-1][l-1]>k)) l++;
	                if(r>=l) ans+=r-l+1;
	            }
	        }
	    }
		System.out.println(ans);
	}

}
