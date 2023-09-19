package 1_15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 小蓝做实验 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\primes.txt")));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		//10^7 ~ 10^8
		//10^3 ~ 10^12
		long ans = 0;
		boolean[] isprime = new boolean[(int)1e8+1];
		for(int i=2;i<=(int)1e8;i++) {
			if(!isprime[i]) {
				for(int j=2;j*i<=(int)1e8;j++) {
					isprime[i*j] = true;
				}
			}
		}
		
		for(int i=0;i<2000000;i++) {
			long n = Long.parseLong(in.readLine());
			if(n>(int)1e8 && prime(n)) {
				ans++;
			}else if(!isprime[(int) n]) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	static boolean prime(long n) {
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
