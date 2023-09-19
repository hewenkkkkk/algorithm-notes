package 直播2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class 子串分值和 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s = in.readLine();
		int ans = 0;
		for(int i=0;i<s.length();i++) {//开头
			Set<Character> set = new HashSet<>();
			//String m = "";
			for(int j=i;j<s.length();j++) {//结尾
				set.add(s.charAt(j));
				//m = m + s.charAt(j);
				ans += set.size();
				//System.out.println(m+"\t"+set+"\t"+set.size());
			}
		}
		System.out.println(ans);
	}

}
