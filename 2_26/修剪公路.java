package 2_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class ÐÞ¼ô¹«Â· {
	static int[] f;
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		if(n==1) {
			System.out.println(0);
			return;
		}
		f = new int[n+1];
		for(int i=1;i<=n;i++) {
			f[i] = i;
		}
		ArrayList<Edge> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			s = in.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int w = Integer.parseInt(s[2]);
			list.add(new Edge(x, y, w));
		}
		int num = 0;
		long ans = 0;
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			Edge e = list.get(i);
			if(find(e.x)!=find(e.y)) {
				merge(e.x,e.y);
				num++;
				ans = ans + e.w;
				if(num==n-1) {
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(-1);
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
	int x;
	int y;
	int w;
	public Edge(int x, int y, int w) {
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