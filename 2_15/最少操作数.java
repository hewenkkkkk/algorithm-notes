package 2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class 最少操作数 {
	static class Infor{
		int n;
		int index;
		public Infor(int n, int index) {
			super();
			this.n = n;
			this.index = index;
		}
	}
	static boolean[] is;//i有没有出现过  contains
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static ArrayList<Infor> q = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		is = new boolean[100001];
		q.add(new Infor(n, 0));
		while(!q.isEmpty()){
			Infor now = q.get(0);
			q.remove(0);
			int x = now.n;
			int index = now.index;
			if(x==m) {
				out.println(index);
				out.flush();
				return;
			}
			for(int i=0;i<3;i++) {
				int ans = x;
				int run = index;
				if(i==0) {
					ans = ans + 1;
					run++;
					if(ans<=100000 && !is[ans]) {
						q.add(new Infor(ans, run));
						is[ans] = true;
					}
				}else if(i==1) {
					ans = ans - 1;
					run++;
					if(ans>=0 && !is[ans]) {
						q.add(new Infor(ans, run));
						is[ans] = true;
					}
				}else {
					ans = ans * 2;
					run++;
					if(ans<=100000 && !is[ans]) {
						q.add(new Infor(ans, run));
						is[ans] = true;
					}
				}
			}
		}
	}
}
