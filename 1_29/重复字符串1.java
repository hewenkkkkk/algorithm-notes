package 直播1_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 重复字符串1 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());//重复次数
		String a = in.readLine();//字符串
		if(a.length()%n!=0 || n>a.length()) {//aabaab 236 7
			System.out.println(-1);
			return;
		}
		int t = a.length() / n;//周期
		int ans = 0;
		for(int i=0;i<t;i++) {
			int max = 0;
			int[] num = new int[26];
			for(int j=i;j<a.length();j+=t) {
				num[a.charAt(j)-'a']++;
				if(num[a.charAt(j)-'a']>max) {
					max = num[a.charAt(j)-'a'];
				}
			}
			ans = ans + (n-max);
		}
		System.out.println(ans);
	}
/**
aacaabaab 3 T=3
aac   
aab
aab

c b b
 * */
	
}
