package ֱ��1_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class �ظ��ַ���2 {

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
		int index = 0;//�±�
		char[][] ch = new char[n][t];
		//aabaac �ظ����� n=2,T=3
		//aab
		//aac
		//aab
		for(int i=0;i<n;i++) { //��ά�ַ�����ĳ�ʼ��
			for(int j=0;j<t;j++) {
				ch[i][j] = a.charAt(index++);
			}
			System.out.println(Arrays.toString(ch[i]));
		}
		int ans = 0;//���
		for(int i=0;i<t;i++) {//ÿһ����
			int[] num = new int[26];
			int max = 0;//��ʾ������
			for(int j=0;j<n;j++) {
				num[ch[j][i]-'a']++;//ÿ����һ���ַ�,��Ӧ���ִ���+1
				if(max<num[ch[j][i]-'a']) {//�ҳ����ִ��������Ǹ��ַ�,max���������ֵĴ���
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
