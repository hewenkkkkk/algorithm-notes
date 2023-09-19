package 直播2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class 小王子双链表 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		N first = new N(null,-1,null);
		N end = new N(null,-1, null);
		N per = first;
		Map<Integer, N> map = new HashMap<>();
		for(int i=1;i<=10;i++) {
			per.next = new N(per,i, null);
			per = per.next;
			map.put(i, per);
		}
		end.last = per;
		per.next = end;
		per = first.next;
		int n = Integer.parseInt(in.readLine());
		int[] m = new int[n];
		for(int i=0;i<n;i++) {
			m[i] = Integer.parseInt(in.readLine());
		}
		for(int i=0;i<n;i++) {
			N now = map.get(m[i]);
			now.last.next = now.next;
			now.next.last = now.last;
			now.next = first.next;
			first.next.last = now;
			first.next = now;
			now.last = first;
			
			per = first.next;
			while(per!=end) {
				System.out.print(per.value+" ");
				per = per.next; 
			}
			System.out.printf("\n");
		}
        
	}
	static class N{
		N last;
		int value;
		N next;
		public N(N last, int value, N next) {
			this.last = last;
			this.value = value;
			this.next = next;
		}
	}
}
