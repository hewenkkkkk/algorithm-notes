package 3_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class 区间不同数 {
	public static class node{
		int l,r,v;
	}
	public static class que{
		int l,id;
	}
	static node tree[];
	public static void main(String[] args) throws IOException {
		StreamTokenizer sc=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	    sc.nextToken();
		int n = (int)sc.nval;
		sc.nextToken();
		int m = (int)sc.nval;
		tree = new node[n*4];
		build(1,1,n);//建树
		int a[] = new int[n+1];
		int last[] = new int[(int)1e5+10];
		for (int i = 1; i < a.length; i++) {
			sc.nextToken();
			a[i] = (int)sc.nval;
		}
		ArrayList<que> q[] = new ArrayList[n+1];
		for (int i = 1; i < q.length; i++) {
			q[i] = new ArrayList<que>(); 
		}
		for (int i = 1; i < m + 1; i++) {
			sc.nextToken();
			int l = (int)sc.nval;
			sc.nextToken();
			int r = (int)sc.nval;
			que e = new que();
			e.l = l;
			e.id = i;
			q[r].add(e);
		}
		int res[] = new int[m+1];
		for (int i = 1; i < q.length; i++) {
			if(last[a[i]] != 0)//之前已经出现过了，需要将之前记录的清0
				modify(1,last[a[i]],0);
			modify(1, i, 1);//将当前位置加1
			last[a[i]] = i;
			for(que e: q[i]) {
				res[e.id] = qurey(1,e.l,i);
			}
		}
		for (int i = 1; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	
	private static void build(int u, int l, int r) {
		// TODO Auto-generated method stub
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
	
	private static int qurey(int u, int l, int r) {
		// TODO Auto-generated method stub
		if(l <= tree[u].l && r >= tree[u].r) {
			return tree[u].v;
		}
		int res = 0;
		int mid = (tree[u].l + tree[u].r) / 2;
		if(l <= mid ) {
			res = qurey(u*2, l, r);
		}
		if(r > mid) {
			res += qurey(u*2+1, l, r);
		}
		return res;
	}
	
	private static void modify(int u, int x, int k) {
		// TODO Auto-generated method stub
		if(tree[u].l == tree[u].r) {
			tree[u].v = k;
		}else {
			int mid = (tree[u].l + tree[u].r)/2;
			if(x <= mid) {
				modify(u*2, x, k);
			}else {
				modify(u*2+1, x, k);
			}
			pushup(u);//更新u
		}
	}
	
	private static void pushup(int u) {
		// TODO Auto-generated method stub
		tree[u].v = tree[u*2].v + tree[u*2+1].v;
	}
}
