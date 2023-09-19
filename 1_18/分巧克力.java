package 直播1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 分巧克力 {
	static int n;//巧克力的数量
	static int k;//小朋友的数量
	static int[] h;//每一块巧克力的长
	static int[] w;//每一块巧克力的宽
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		h = new int[n];
		w = new int[n];
		for(int i=0;i<n;i++) {
			s = in.readLine().split(" ");
			h[i] = Integer.parseInt(s[0]);
			w[i] = Integer.parseInt(s[1]);
		}
		int l = 1;
		int r = 100000;
		while(l<r) {
			int mid = (r+l+1)>>1;
			if(check(mid)>=k) l = mid;
			else r = mid-1;
		}
		System.out.println(l);
	}
	static int check(int mid) {
		int ans = 0;
		for(int i=0;i<n;i++) {//每一块巧克力
			ans = ans + (h[i]/mid) * (w[i]/mid);
		}
		return ans;
	}

}
