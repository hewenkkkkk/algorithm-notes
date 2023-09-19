package 1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class _123 {
	static long[] sum = new long[1500000+1];//前n组中数和
	static long[] num = new long[1500000+1];//前n组中数的个数
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i=1;i<=1500000;i++) {
			num[i] = num[i-1] + i;
			sum[i] = sum[i-1] + (1L+i)*i/2; 
		}
		int n = Integer.parseInt(in.readLine());
		while(n-->0) {
			String[] s = in.readLine().split(" ");
			long a = Long.parseLong(s[0]);
			long b = Long.parseLong(s[1]);
			System.out.println(s(b)-s(a-1));
		}
	}
	static long s(long x) {//第1个数到第x个数的和 x = 8
		// TODO Auto-generated method stub
		int l = 1;//组
		int r = 1500000;//组
		while(l<r) {
			int mid = (l + r) >> 1;
			if(x>num[mid]) l = mid+1;
			else r = mid;
		}
		//现在r是第x个数在第r组
		r--;//前面有r--个完整的组
		x = x - num[r];//你是本组的第几个数
		return sum[r]+(1L+x)*x/2;
	}

}
