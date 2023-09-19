package 直播2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 栈bfs {
	
	static class bfs{
		String s;
		int num0;//入
		int num1;//出
		public bfs(String s,int num0,int num1) {
			this.s = s;
			this.num0 = num0;
			this.num1 = num1;
		}
	}
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());
			int ans = 0;
			Queue<bfs> queue = new LinkedList<>();
			queue.add(new bfs("0",1, 0));
			while(queue.size()!=0) {
				bfs now = queue.poll();
				String ss = now.s;
				int n0 = now.num0;
				int n1 = now.num1;
				if(n0==n && n1==n) {
					ans++;
					//System.out.println(ss);
					continue;
				}
				if(n0>n || n1>n) 
					continue;
				for(int i=0;i<2;i++) {
					if((i&1)==0) {//入
						queue.add(new bfs(ss+"0", n0+1, n1));
					}else {//出
						if(n0>n1) {
							queue.add(new bfs(ss+"1", n0, n1+1));
						}
					}
				}
			}
			System.out.println(ans);
	}
}
