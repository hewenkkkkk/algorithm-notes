package ֱ��2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��ˮ���� {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		s = in.readLine().split(" ");
		int[] x = new int[n];//ÿһ������Ҫ�Ӷ���ˮ
		for(int i=0;i<n;i++) {
			x[i] = Integer.parseInt(s[i]);
		}
		int[] ans = new int[m];//��ʾÿһ��ˮ��ͷ��Ҫ������ˮ��
		if(m==1) {
			long num = 0;
			for(int i=0;i<n;i++) {
				num = num + x[i];
			}
			System.out.println(num);
			return;
		}
		for(int i=0;i<m;i++) {
			ans[i] = x[i];
		}
		for(int i=m;i<n;i++) {//��i���ˣ����Ǹ�ˮ��ͷ��ˮ
			int min = Integer.MAX_VALUE;
			int index = -1;//Ŀǰ��С���Ǹ�ˮ��ͷ���±�
			for(int j=0;j<m;j++) {
				if(min>ans[j]) {
					min = ans[j];
					index = j;
				}
			}
			ans[index] = ans[index] + x[i];
		}
		int max = 0;
		for(int i=0;i<m;i++) {
			if(ans[i]>max)
				max = ans[i];
		}
		System.out.println(max);
	}
}
