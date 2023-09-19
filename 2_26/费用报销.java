package 直播2_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class 费用报销 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int w[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	static int sum[] = new int[13];
	public static void main(String[] args) throws IOException{
		for(int i=1;i<=12;i++)
			sum[i] = sum[i-1] + w[i];
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int k = Integer.parseInt(s[2]);
		ArrayList<In> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			s = in.readLine().split(" ");
			int month = Integer.parseInt(s[0]);
			int data = Integer.parseInt(s[1]);
			int v = Integer.parseInt(s[2]);
			list.add(new In(sum[month-1]+data, v));
		}
		Collections.sort(list);
//		for(In i:list)
//			System.out.println(i.day+" "+i.value);
		boolean[][] dp = new boolean[n+1][m+1];//能否凑出来前i张票据，j的金额
		dp[0][0] = true;
		int l = 0;
		for(int i=1;i<=n;i++) {
			while(list.get(i-1).day-list.get(l).day >= k) l++;
			for(int j=0;j<=m;++j){
				dp[i][j]=dp[i-1][j];
				if(j>=list.get(i-1).value) dp[i][j]|=dp[l][j-list.get(i-1).value];
			}
		}
		for(int i=m;i>=0;i--) {
			if(dp[n][i]) {
				System.out.println(i);
				break;
			}
		}
	}
}
class In implements Comparable<In>{
	int day;
	int value;
	public In(int day,int value) {
		this.day = day;
		this.value = value;
	}
	@Override
	public int compareTo(In o) {
		return this.day-o.day;
	}
}