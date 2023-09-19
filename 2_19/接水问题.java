package 直播2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 接水问题 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		s = in.readLine().split(" ");
		int[] x = new int[n];//每一个人需要接多少水
		for(int i=0;i<n;i++) {
			x[i] = Integer.parseInt(s[i]);
		}
		int[] ans = new int[m];//表示每一个水龙头需要流出的水量
		if(m==1) {
			long num = 0;
			for(int i=0;i<n;i++) {
				num = num + x[i];
			}
			System.out.println(num);
			return;
		}
		for(int i=0;i<m;i++) {
			ans[i] = x[i];
		}
		for(int i=m;i<n;i++) {//第i个人，在那个水龙头接水
			int min = Integer.MAX_VALUE;
			int index = -1;//目前最小的那个水龙头的下标
			for(int j=0;j<m;j++) {
				if(min>ans[j]) {
					min = ans[j];
					index = j;
				}
			}
			ans[index] = ans[index] + x[i];
		}
		int max = 0;
		for(int i=0;i<m;i++) {
			if(ans[i]>max)
				max = ans[i];
		}
		System.out.println(max);
	}
}
