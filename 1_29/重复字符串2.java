package 直播1_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 重复字符串2 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());
		String a = in.readLine();
		if(a.length()%n!=0 || n>a.length()) {
			System.out.println(-1);
			return;
		}
		int t = a.length() / n;
		int index = 0;//下标
		char[][] ch = new char[n][t];
		//aabaac 重复两次 n=2,T=3
		//aab
		//aac
		//aab
		for(int i=0;i<n;i++) { //二维字符数组的初始化
			for(int j=0;j<t;j++) {
				ch[i][j] = a.charAt(index++);
			}
			System.out.println(Arrays.toString(ch[i]));
		}
		int ans = 0;//结果
		for(int i=0;i<t;i++) {//每一数列
			int[] num = new int[26];
			int max = 0;//表示最多次数
			for(int j=0;j<n;j++) {
				num[ch[j][i]-'a']++;//每出现一个字符,对应出现次数+1
				if(max<num[ch[j][i]-'a']) {//找出出现次数最多的那个字符,max就是他出现的次数
					max = num[ch[j][i]-'a'];
				}
			}
			System.out.println(n-max);
			ans = ans + (n-max);
		}
		System.out.println(ans);
		//aabbaaaab n=3,T=3
		//a a b
		//b a a
		//a a b
		//a->2 1
		//a->3 0
		//b->2 1
		//ababababccdcdac 3
	}

}
