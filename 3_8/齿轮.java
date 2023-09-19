package Ö±²¥3_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class ³ÝÂÖ {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static boolean[] have = new boolean[200010];
	static boolean[] contain = new boolean[200010];
    public static void main(String[] args) throws IOException{
		String[] s = in.readLine().split(" ");
    	int n = Integer.parseInt(s[0]);
		int q = Integer.parseInt(s[1]);
		int[] a = new int[n];
		s = in.readLine().split(" ");
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			int v = a[i];
			for(int j=1;j<=v/j;j++) {
				if(v%j==0) {
					if(contain[j]) {
						have[v/j] = true;
					}
					if(contain[v/j]) {
						have[j] = true;
					}
				}
			}
			contain[v] = true;
		}
		for(int i=0;i<q;i++) {
			int h = Integer.parseInt(in.readLine());
			if(n==1 && h==1) {
				System.out.println("YES");
			}else if(have[h]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
    }
}
