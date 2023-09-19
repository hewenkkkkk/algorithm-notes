package ֱ��2_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class ��̥������ {

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
���� replaceAll ����ʹ��������ʽ���ַ��������޸ģ����У�
[A-Z] ��ʾ����һ����д��ĸ
$0 ��ʾƥ�䵽�ĵ�һ���ַ������ô�д��ĸ��
_$0 ��ʾ��ƥ�䵽�Ĵ�д��ĸǰ��һ���»��ߣ���Ϊ�ָ���ʹ�ã�
�����ʹ�÷��� split ���»��� ��_�� Ϊ�ָ����ָ��ַ������õ����
*/