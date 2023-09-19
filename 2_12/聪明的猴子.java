package 2_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
4
1 2 3 4
6
0 0
1 0
1 2
-1 -1
-2 0
2 2
 * */
public class 聪明的猴子 {
	static int ans = 0;//几只猴子能
	static int n;//树的数量
	static int[] a;//每只猴子的跳跃距离
	static int m;//猴子的数量
	static int[] x;
	static int[] y;
	static double max;//最小生成树的最长路
	static int[] f;//这个结点的父亲
	static int num = 0;//最小生成树已经选择了几条边
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		m = Integer.parseInt(in.readLine().trim());
		a = new int[m];
		String[] s = in.readLine().trim().split(" ");
		for(int i=0;i<m;i++)
			a[i] = Integer.parseInt(s[i]);
		n = Integer.parseInt(in.readLine().trim());
		x = new int[n];
		y = new int[n];
		for(int i=0;i<n;i++) {
			s = in.readLine().trim().split(" ");
			x[i] = Integer.parseInt(s[0]);
			y[i] = Integer.parseInt(s[1]);
		}
		ArrayList<Edge> list = new ArrayList<>();//路
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				double l = Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
				Edge edge = new Edge(i, j, l);
				list.add(edge);
			}
		}
		Collections.sort(list);//最短路
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).x+" "+list.get(i).y+" "+list.get(i).w);
		f = new int[n];
		for(int i=0;i<n;i++)
			f[i] = i;
		for(int i=0;i<list.size();i++) {
			Edge e = list.get(i);
			if(find(e.x)!=find(e.y)) {//如果这条边连了，就构成环了
				merge(e.x,e.y);
				max = Math.max(max, e.w);
				num++;
				if(num==n-1)//最小生成树边的数量一定=结点数-1
					break;
			}
		}
		for(int i=0;i<m;i++)
			if(a[i]>=max)
				ans++;
		System.out.println(ans);
	}
	static int find(int x) {
		if(f[x] == x)
			return f[x];
		f[x] = find(f[x]);
		return f[x];
	}
	static void merge(int x,int y) {
		int xx = find(x);
		int yy = find(y);
		f[yy] = xx;
	}
}
class Edge implements Comparable<Edge>{
	int x;//路的起点
	int y;//路的重点
	double w;//路之间的距离
	public Edge(int x, int y, double w) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.w>o.w?1:-1;
	}
}