package 2_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class 最少刷题数 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(in.readLine());
        String[] s = in.readLine().split(" ");
        int[] a = new int[n], tmp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            tmp[i] = a[i];
        }
        Arrays.sort(tmp);
        int mid = tmp[n / 2];
        int more = 0;
        int less = 0; 
        //more <= less
        for (int i = 0; i < n; i++)
            if (a[i] < mid) 
            	less ++;
            else if (a[i] > mid) 
            	more ++;
        if(more < less) {
            for (int i = 0; i < n; i++)
                if (a[i] < mid) 
                	System.out.print(mid - a[i] + " ");
                else 
                	System.out.print(0 + " ");
        }else if (more == less){
            for (int i = 0; i < n; i++)
                if (a[i] < mid) 
                	System.out.print(mid - a[i] + 1 + " ");
                else 
                	System.out.print(0 + " ");
        }else {
            for (int i = 0; i < n; i++)
                if (a[i] <= mid) 
                	System.out.print(mid - a[i] + 1 + " ");
                else 
                	System.out.print(0 + " ");
        }
    }
}