package 直播3_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 小球与盒子 {
	public static class node{
		int l,r;//左右边界
		long v;//左右边界内，每一个的值的和
	}
	static node tree[];
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		tree = new node[n*4];
		build(1,1,n);//建树
	    for (int i = 0; i < m; i++) {
	    	s = in.readLine().split(" ");
			int op = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			int y = Integer.parseInt(s[2]);
		    if(op == 1) {
		    	modify(1, x, y);
		    }else {
				System.out.println(qurey(1, x, y));
			}
		}	
	}
	
	private static void build(int u, int l, int r) {
		tree[u] = new node();
		if(l == r){//叶子节点		
			tree[u].l = l;
			tree[u].r = r;
		}else {
			tree[u].l = l;
			tree[u].r = r;
			int mid = (l + r)/2;
			build(2*u, l, mid);
			build(2*u+1, mid + 1, r);
		}	  
	}
	
	private static long qurey(int u, int l, int r) {
		if(l <= tree[u].l && r >= tree[u].r) {
			return tree[u].v;
		}
		long res = 0;
		int mid = (tree[u].l + tree[u].r) / 2;
		if(l <= mid ) {
			res = qurey(u*2, l, r);
		}
		if(r > mid) {
			res += qurey(u*2+1, l, r);
		}
		return res;
	}
	
	private static void modify(int u, int x, long k) {
		if(tree[u].l == tree[u].r) {
			tree[u].v += k;
		}else {
			int mid = (tree[u].l + tree[u].r)/2;
			if(x <= mid) {
				modify(u*2, x, k);
			}else {
				modify(u*2+1, x, k);
			}
			pushup(u);
		}
	}
	
	private static void pushup(int u) {
		tree[u].v = tree[u*2].v + tree[u*2+1].v;
	}
}
