package 1_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 求阶乘AC {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/**125 1~125能拆除多少个5
25		 * 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 105 110 115 120 125  每一个数都先拆一个
5		 * 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20  21  22  23  24  25   拆第二个5
1		 * 			   1			  2				 3				4					5   拆第三个5
31		 * 																				1
		 * */
		long k = Long.parseLong(in.readLine());
		long l = 0,r = Long.MAX_VALUE-10;//防止溢出
		//l = 
		//1    		    mid         k        1000000000
		//1			 4 
		//2
		
		while(l < r) {
			long mid = (l + r) / 2;
			System.out.print("mid="+mid);
			if(k <= sum(mid)) {
				r = mid;
			}else {
				l = mid + 1;
			}
			System.out.print("\t"+sum(mid));
			System.out.println("\t"+l+"\t"+ r);
		}
		if(sum(r)==k) {
			System.out.println(r);
		}else {
			System.out.println(-1);
		}
	}
	static long sum(long n){
		long res = 0;
		while(n != 0) {
			res = res + n / 5;
			n/=5;
		}
		return res;
	}
}
