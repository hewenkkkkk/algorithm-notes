package ֱ��2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class �Ӵ���ֵ��AC {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int[] last = new int[26];//�洢ÿһ���ַ���һ�γ��ֵ�λ��
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		char[] s = in.readLine().toCharArray();
		long ans = 0;
		Arrays.fill(last, -1);//��ʼ��ʱ��,ÿһ���ַ�����û�г���
		for(int i=0;i<s.length;i++) {
			ans = ans + (long)(i - last[s[i]-'a']) * (s.length-i);
			//(long)(i - last[s[i]-'a']) * (s.length-i);����ַ��Ĺ��׶�
			last[s[i]-'a']=i;//����ַ���iλ�ó�����
		}
		System.out.println(ans);
	}

}
