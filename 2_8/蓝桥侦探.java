package 直播2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 蓝桥侦探 {
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
			if(find(x)!=find(y)) {//判断根据目前已知的信息，x和y在不在一起，如果在一起，直接输出x说谎了
				deal(x, y+n);//x和!y合并在一起
				deal(x+n, y);//!x和y合并在一起
			}else {
				System.out.println(x);
				return;
				
			}
			
		}
		
	}
	static int find(int x) {
		if(point[x]!=x)//夫点不是自己
			point[x]=find(point[x]);
		return point[x];
	}
	static void deal(int x,int y) {
		x = find(x);
		y = find(y);
		point[y] = x;
	}
}
