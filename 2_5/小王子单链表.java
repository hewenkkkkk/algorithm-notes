package 2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class 小王子单链表 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		Node first = new Node(-1,null);
		Node end = new Node(-1, null);
		Node per = first;
		Map<Integer, Node> map = new HashMap<>();
		for(int i=1;i<=10;i++) {
			per.next = new Node(i, null);
			per = per.next;
			map.put(i, per);
		}
		per.next = end;
		per = first.next;
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++) {
			int m = Integer.parseInt(in.readLine());
			Node now = map.get(m);
			Node up = first;
			while(up.next!=now) {
				up = up.next;
			}
			up.next = now.next;
			now.next = first.next;
			first.next = now;
			
			per = first.next;
			while(per!=end) {
				System.out.print(per.value+" ");
				per = per.next; 
			}
			System.out.printf("\n");
		}
        
	}
	static class Node{
		int value;
		Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
