package ֱ��2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class �Ӵ���ֵ�� {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s = in.readLine();
		int ans = 0;
		for(int i=0;i<s.length();i++) {//��ͷ
			Set<Character> set = new HashSet<>();
			//String m = "";
			for(int j=i;j<s.length();j++) {//��β
				set.add(s.charAt(j));
				//m = m + s.charAt(j);
				ans += set.size();
				//System.out.println(m+"\t"+set+"\t"+set.size());
			}
		}
		System.out.println(ans);
	}

}
