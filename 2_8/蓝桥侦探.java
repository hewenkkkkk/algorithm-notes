package ֱ��2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ������̽ {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int[] point;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		point = new int[2*n+2];
		for(int i=0;i<2*n+2;i++) {//!2 point[!2]=2+n
			point[i] = i;
		}
		for(int i=0;i<m;i++) {
			s = in.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			if(find(x)!=find(y)) {//�жϸ���Ŀǰ��֪����Ϣ��x��y�ڲ���һ�������һ��ֱ�����x˵����
				deal(x, y+n);//x��!y�ϲ���һ��
				deal(x+n, y);//!x��y�ϲ���һ��
			}else {
				System.out.println(x);
				return;
				
			}
			
		}
		
	}
	static int find(int x) {
		if(point[x]!=x)//��㲻���Լ�
			point[x]=find(point[x]);
		return point[x];
	}
	static void deal(int x,int y) {
		x = find(x);
		y = find(y);
		point[y] = x;
	}
}
