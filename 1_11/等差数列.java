package 1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 等差数列 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());
		long[] num = new long[n];
		String[] s = in.readLine().split(" ");
		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		//2 6 4 10 20
		//2 4 6 10 20
		//2 4 6 8 10 12 14 16 18 20
		Arrays.sort(num);//快排,nlogn
		long d = Long.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			if(num[i+1]-num[i]<d) {
				d = (num[i+1]-num[i]);
			}
		}
		//d = 0
		//1 1 1 1 1
		//n
		if(d==0) {
			System.out.println(n);
			return;
		}
		//(num[n-1]-num[0])/2  间隔数
		//3 6 9 12 15  12 / 3 4
		System.out.println((num[n-1]-num[0])/d+1);
	}

}
