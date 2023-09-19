package Ö±²¥2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ×óÒÆÓÒÒÆ_Ë«Á´±í {
	static class Node{
		Node up;
		int value;
		Node down;
		public Node(Node up, int value, Node down) {
			this.up = up;
			this.value = value;
			this.down = down;
		}
	}
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Map<Integer, Node> map = new HashMap<>();
        Node first = new Node(null, -1, null);
        Node last = new Node(null, -1, null);
        Node no = first;
        for(int i=1;i<=n;i++) {
        	no.down = new Node(no, i, null);
        	no = no.down;
        	map.put(i, no);
        }
        last.up = no;
        no.down = last;
        
        for(int i=0;i<m;i++) {
        	s = in.readLine().split(" ");
        	char ch = s[0].charAt(0);
        	int x = Integer.parseInt(s[1]);
        	Node node = map.get(x);
        	node.up.down = node.down;
        	node.down.up = node.up;
        	if(ch=='L') {
        		node.down = first.down;
        		first.down.up = node;
        		first.down = node;
        		node.up = first;
        	}else {
        		node.up = last.up;
        		last.up.down = node;
        		node.down = last;
        		last.up = node;
        	}
        }
        no = first.down;
        while(no!=last) {
        	System.out.print(no.value+" ");
        	no = no.down; 
        }
	}
}
