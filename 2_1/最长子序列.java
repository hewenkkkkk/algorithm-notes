package 2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ������� {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s = in.readLine();
		String t = in.readLine();
		int ans = 0;//��������t�ַ����е��ĸ��ַ�
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==t.charAt(ans)) {
				ans++;
			}
		}
		//ABCDEABCD
		//AABZ
		System.out.println(ans);
	}

}
