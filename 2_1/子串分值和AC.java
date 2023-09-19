package 直播2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 子串分值和AC {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int[] last = new int[26];//存储每一个字符上一次出现的位置
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		char[] s = in.readLine().toCharArray();
		long ans = 0;
		Arrays.fill(last, -1);//初始的时候,每一个字符都还没有出现
		for(int i=0;i<s.length;i++) {
			ans = ans + (long)(i - last[s[i]-'a']) * (s.length-i);
			//(long)(i - last[s[i]-'a']) * (s.length-i);这个字符的贡献度
			last[s[i]-'a']=i;//这个字符在i位置出现了
		}
		System.out.println(ans);
	}

}
