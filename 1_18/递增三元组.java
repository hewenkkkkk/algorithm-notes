package 1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 递增三元组 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
 		String[] s = in.readLine().split(" ");
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		s = in.readLine().split(" ");
		for(int i=0;i<n;i++) {
			b[i] = Integer.parseInt(s[i]);
		}
		s = in.readLine().split(" ");
		for(int i=0;i<n;i++) {
			c[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		Arrays.sort(c);
		long ans = 0;
		for(int i=0;i<n;i++) {//一次枚举b数组中的元素
			int left = 0;
			int right = n-1;
			while(left<right) {
				int middle = (left+right+1)>>1;
				if(a[middle]<b[i]) left = middle;
				else right = middle - 1;
			}
			int x = right;
			left = 0;
			right = n-1;
			while(left<right) {
				int middle = (left+right)>>1;
				if(c[middle]>b[i]) right = middle;
				else left = middle + 1;
			}
			int y = right;
			if(a[x]<b[i] && b[i]<c[y])
				ans = ans + (long)(x+1) * (n-y);//(x+1)是a中比b小的数的个数,(n-y)是c中比b大的元素个数
			//a 0 1 2 3
			//b = 2
			//c 1 2 3 4 5
			//y = 2
		}
		
		System.out.println(ans);
	}

}
