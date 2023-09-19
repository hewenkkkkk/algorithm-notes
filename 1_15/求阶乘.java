package 1_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 求阶乘 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		//1 1 
		//2 2
		//3 6
		//4 24 
		//5 120
		//6 720
		//唯一分解定理:每一个正整数都可以分成n个素数的乘积
		//1*2*3*4*5*6*7*8*9*10
		//1*2*3*2*2*5*2*3*2*2*2*3*3*2*5  2:8   5:2
		//long sum2 = 3;
		long sum5 = 0;
		long k = Long.parseLong(in.readLine());
		for(long i=5;;i+=5) {//25  24->4个5  25->6个5
			long m = i;
//			while(m%2==0) {
//				sum2++;
//			}
			while(m%5==0) {
				sum5++;
				m/=5;
			}
			if(sum5==k) {
				System.out.println(i);//k=5
				return;
			}else if(sum5>k) {
				System.out.println(-1);
				return;
			}
		}
	}
}
