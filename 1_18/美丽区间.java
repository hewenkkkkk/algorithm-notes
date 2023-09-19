package 直播1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 美丽区间 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] num = new int[n+1];//数组内容
		int[] add = new int[n+1];//前缀合
 		s = in.readLine().split(" ");
		for(int i=1;i<=n;i++) {
			num[i] = Integer.parseInt(s[i-1]);
			add[i] = add[i-1] + num[i];
		}
		int length = Integer.MAX_VALUE;
		//O(nlogn)
		//O(n^2)
		for(int i=1;i<=n;i++) {//枚举左边界,找右边界
			int left = i;
			int right = n;
			while(left<right) {
				int middle = (left+right)>>1;
				if(add[middle]-add[i-1]>=m) right = middle;
				else left = middle + 1;
			}
			//right是找到的右边界
			//2 3 4 5
			if(add[right]-add[i-1]>=m) length = Math.min(length, right-i+1);
		}
		System.out.println(length==Integer.MAX_VALUE?0:length);
	}

}
