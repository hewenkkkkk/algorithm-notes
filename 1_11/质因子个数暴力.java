package 1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class 质因子个数暴力 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Set<Long> set = new HashSet<>();
		long n = Long.parseLong(in.readLine());
		for(long i=1;i<=n;i++) {
			if(n%i==0) {
				if(isprime(i)) {
					set.add(i);
				}
				if(isprime(n/i)) {
					set.add(n/i);
				}
			}
		}
		System.out.println(set.size());
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
