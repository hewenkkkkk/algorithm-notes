package 直播2_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 蓝桥骑士 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split(" ");
		int[] a = new int[n];//存放数据
		int[] f = new int[n];//长度为i的上升子序列的末尾元素最小值为f[i]
		int length = 0;
		for(int i=0;i<n;i++) {//n^2 = 9*10^10   10e5  nlogn    10e4 = 10e8
			a[i] = Integer.parseInt(s[i]);
			int l = 0;
			int r = length;
			while(l<r) {
				int mid = (l+r+1)>>1;
				if(f[mid]>=a[i])
					r = mid - 1;
				else
					l = mid;
			}
			length = Math.max(length, r+1);
			f[r+1] = a[i];
		}
		System.out.println(length);
		System.out.println(Arrays.toString(f));
	}

}
