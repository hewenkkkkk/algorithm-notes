package 1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 最小质因子AC {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static long[] ans = new long[3000001];//存储每一个数的最小质因子
	static long[] sum = new long[3000001];//表示2~n的最小质因子之和
	static boolean[] isprime = new boolean[3000001];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/**
 	3
	5	2~5
	10	2~10
	15	2~15重复计算
	
	2~3*10^6
*/
		get(3000000);
		
		for(int i=2;i<=3000000;i++) {//前缀和
			sum[i] = sum[i-1] + ans[i];
		}
		
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(in.readLine());
			System.out.println(ans[n]);
		}
	}
	static void get(int n) {//埃氏筛法
		// TODO Auto-generated method stub
		for(int i=2;i<=n;i++) {//遍历
			if(!isprime[i]) {//i是素数
				ans[i] = i;//i的最小质因子是i
				for(int j=2;j*i<=n;j++){//j表示倍数
					if(!isprime[j*i]) {
						isprime[i*j] = true;//表示i*j为合数,最小质因子已经有了
						ans[i*j] = i;//i是i*j的最小质因子
					}
				}
			}
		}
		
	}

}
