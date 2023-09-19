package 直播1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 质因子个数 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long n = Long.parseLong(in.readLine());
		long m = n;
		long sum = 0;
		for(int i=2;i<=m/i;i++) {//396 
			if(n%i==0) {
				sum++;//1
				System.out.println(i);
				while(n%i==0) {
					n/=i;//198 99 
				}
			}
		}
		if(n>1)
			//sum++;
			System.out.println(n);
		//System.out.println(sum);
		
	}
}
