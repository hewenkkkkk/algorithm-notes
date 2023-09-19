package 2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ◊Û“∆”““∆_’ª {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        boolean[] b = new boolean[n+1];
        int[] a = new int[n+1];
        char[] c = new char[m];
        int[] x = new int[m];
        for(int i=0;i<m;i++) {
        	s = in.readLine().split(" ");
            char ch = s[0].charAt(0);
            int z = Integer.parseInt(s[1]);
            c[i] = ch;
            x[i] = z;
        }
        Stack<Integer> r = new Stack<>();
        Queue<Integer> l = new LinkedList<>();
        for(int i=m-1;i>=0;i--) {
        	if(a[x[i]]==0) {
        		a[x[i]] = 1;
        		if(c[i]=='L')
        			l.add(x[i]);
        		else
        			r.push(x[i]);
        	}
        }
        int ans = 0;
        while(l.size()!=0) {
        	ans++;
        	System.out.print(l.poll());
        	if(ans!=n)
        		System.out.print(" ");
        }
        for(int i=1;i<=n;i++) {
        	if(a[i]==0) {
        		ans++;
        		System.out.print(i);
            	if(ans!=n)
            		System.out.print(" ");
        	}
        }
        while(r.size()!=0) {
        	ans++;
        	System.out.print(r.pop());
        	if(ans!=n)
        		System.out.print(" ");
        }
	}
}
/*
10 10 
L 3 
L 9 
L 5 
L 4 
R 1 
R 5 
R 5 
R 2 
L 1 
R 10
**/
//1 4 9 3 6 7 8 5 2 10
//1 4 9 3 6 7 8 5 2 10
