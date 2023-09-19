package 直播2_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 蓝胎子序列 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		String s = in.readLine();
		String t = in.readLine();
//		String[] a = s.split("[A-Z]");
//		System.out.println(Arrays.toString(a));
		System.out.println(s.replaceAll("[A-Z]", " $0"));
		String[] s1 = s.replaceAll("[A-Z]", " $0").split(" ");
		String[] t1 = t.replaceAll("[A-Z]", " $0").split(" ");
		System.out.println(Arrays.toString(s1));
		int[][] dp = new int[s1.length][t1.length];
		for(int i=1;i<s1.length;i++) {
			for(int j=1;j<t1.length;j++) {
				if(s1[i].equals(t1[j]))
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		System.out.println(dp[s1.length-1][t1.length-1]);
	}

}
/**
方法 replaceAll 可以使用正则表达式对字符串进行修改，其中：
[A-Z] 表示任意一个大写字母
$0 表示匹配到的第一个字符（即该大写字母）
_$0 表示在匹配到的大写字母前加一个下划线（作为分隔符使用）
最后再使用方法 split 以下划线 ’_‘ 为分隔符分割字符串，得到结果
*/