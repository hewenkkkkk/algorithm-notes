package 1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ��С������AC {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static long[] ans = new long[3000001];//�洢ÿһ��������С������
	static long[] sum = new long[3000001];//��ʾ2~n����С������֮��
	static boolean[] isprime = new boolean[3000001];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/**
 	3
	5	2~5
	10	2~10
	15	2~15�ظ�����
	
	2~3*10^6
*/
		get(3000000);
		
		for(int i=2;i<=3000000;i++) {//ǰ׺��
			sum[i] = sum[i-1] + ans[i];
		}
		
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(in.readLine());
			System.out.println(ans[n]);
		}
	}
	static void get(int n) {//����ɸ��
		// TODO Auto-generated method stub
		for(int i=2;i<=n;i++) {//����
			if(!isprime[i]) {//i������
				ans[i] = i;//i����С��������i
				for(int j=2;j*i<=n;j++){//j��ʾ����
					if(!isprime[j*i]) {
						isprime[i*j] = true;//��ʾi*jΪ����,��С�������Ѿ�����
						ans[i*j] = i;//i��i*j����С������
					}
				}
			}
		}
		
	}

}
