package 3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 蓝桥公园 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
    	String[] s = in.readLine().split(" ");
    	int n = Integer.parseInt(s[0]);
    	int m = Integer.parseInt(s[1]);
    	int q = Integer.parseInt(s[2]);
    	long[][] g = new long[n][n];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			if(i!=j)
    				g[i][j] = Long.MAX_VALUE;
    		}
    	}
    	for(int i=0;i<m;i++) {
    		s = in.readLine().split(" ");
        	int x = Integer.parseInt(s[0])-1;
        	int y = Integer.parseInt(s[1])-1;
        	long w = Long.parseLong(s[2]);
        	g[x][y] = Math.min(w, g[x][y]);
        	g[y][x] = Math.min(w, g[y][x]);
    	}
    	for(int i=0;i<n;i++) //中转结点
    		for(int j=0;j<n;j++) //起点
    			for(int k=0;k<n;k++) //终点
    				if(i!=j && j!=k && i!=k && g[j][i]!=Long.MAX_VALUE && g[i][k]!=Long.MAX_VALUE) 
    					g[j][k] = Math.min(g[j][k], g[j][i] + g[i][k]);
    	for(int i=0;i<q;i++) {
    		s = in.readLine().split(" ");
        	int x = Integer.parseInt(s[0])-1;
        	int y = Integer.parseInt(s[1])-1;
        	if(g[x][y]!=Long.MAX_VALUE)
        		System.out.println(g[x][y]);
        	else
        		System.out.println(-1);
    	}
	}
}
