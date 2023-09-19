package 2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 蓝桥部队 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int[] f;//存放此列的排头元素
	static int[] length;//存放此列的军人数量
	static int[] num;//此军人是此列第几个
	public static void main(String[] args) throws IOException{
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		f = new int[n+1];
		length = new int[n+1];
		num = new int[n+1];
		for(int i=1;i<=n;i++) {
			f[i] = i;
			length[i] = 1;
		}
		for(int i=0;i<m;i++) {
			s = in.readLine().split(" ");
			int op = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			int y = Integer.parseInt(s[2]);
			if(op==1) {//合并x和y所在列 x到y后面 
				and(x, y);
			}else {//求x和y间隔
				if(find(x)!=find(y)) {
					System.out.println(-1);
				}else {
					System.out.println(Math.abs(num[x]-num[y])-1);
				}
			}
		}
	}
	
	static void and(int x,int y) {
		x = find(x);//查找x的排头
		y = find(y);//查找y的排头
		if(x==y)//如果不做此判断，只能过20%，不能把已经在一起的两列合并
			return;
		num[x] = num[x] + length[y];//x在y的后面，所以现在x是这一列的第几个，需要加上y所在列一共有多少个人
		length[y] = length[y] + length[x];//x和y列合并，这一列的总人数更新
		f[x] = y;//x军人这一列的排头是y
	}
	
	static int find(int x) {
		if(x!=f[x]) {//x不是x所在列的排头
			int root = find(f[x]);//递归找到x所在列的排头是谁
			num[x] = num[x] + num[f[x]];//现在x是这一列的第几个人，就是原来x是这一列的第几个人再加上x的排头是这一列的第几个
			return f[x] = root;
		}
		return f[x];
	}
}
