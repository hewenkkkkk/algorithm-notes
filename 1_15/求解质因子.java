package 直播1_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 求解质因子 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		long n = Long.parseLong(in.readLine());
		for(long i=2L;i<=n/i;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				while(n%i==0) {
					n/=i;
				}
			}
		}
		if(n>1)
			System.out.print(n);
	}

}
