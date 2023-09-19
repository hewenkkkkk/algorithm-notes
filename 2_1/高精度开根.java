package 直播2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

public class 高精度开根 {
	static BigInteger m;
	static BigInteger n;
	static BigInteger zero = BigInteger.ZERO;
	static BigInteger one = BigInteger.ONE;
	static BigInteger two = BigInteger.valueOf(2);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		m = new BigInteger(in.readLine());
		n = new BigInteger(in.readLine());
		//x^m=n
		BigInteger l = zero;
		BigInteger r = one; 
		//log10^10000
		while(check(r).compareTo(n)<=0) {//优化左右边界范围
			//n=9
			//l  r
			//1  2
			//2  4
			//4  8
			//8  16
            l=r;
            r=r.multiply(two);
            System.out.println(l+" "+r);
        }
		while(l.compareTo(r)<=0) {//l<=r
			BigInteger mid = l.add(r).divide(two);//(l+r)/2
			if(check(mid).compareTo(n)==0) {//mid^m==n
				out.print(mid);
				out.flush();
				return;
			}
			//compare >0 左>右 ==0 左==右 <0 左<右
			else if(check(mid).compareTo(n)<0)//<=0
				l = mid.add(one);//l=mid+1
			else
				r = mid.subtract(one);//r=mid-1
		}
		
	}
	static BigInteger check(BigInteger x) {//x^m m=3 x*x*x
		BigInteger ans = one;
		for(BigInteger i = zero;i.compareTo(m)<0;i=i.add(one)) {//i=0;i<m;i++
			ans = ans.multiply(x);//ans = ans*x     
		}
		return ans;
	}
}
