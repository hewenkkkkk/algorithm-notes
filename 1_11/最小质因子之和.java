package 直播1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 最小质因子之和 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//5 2~5 2+3+2+5=12
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(in.readLine());
			System.out.println(check(n));
		}
	}
	static long check(int n) {
		// TODO Auto-generated method stub
		long num = 0;
		for(int i=2;i<=n;i++) {
			if(isprime(i)) {
				num = num + i;//i是素数,i的最小质因子就是i
			}else {
				for(int j=2;j<=i/j;j++) {
					if(i%j==0 && isprime(j)) {
						num = num + j;
						break;//保证我刚加的j是最小的质因子
					}
				}
			}
		}
		return num;
	}
	static boolean isprime(long n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=n/i;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
