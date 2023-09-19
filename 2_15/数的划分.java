package 2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 数的划分 {
	static int ans = 0;
	static int k;
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		f(n,1,0);
		System.out.println(ans);
	}
    static void f(int num,int max,int n) {//拼多少，目前已经用过最大的，拼了几个数，最多几个数
    	if(num>=max && n==k-1) {
    		ans++;
    		return;
    	}
    	for(int i=1;i<=num;i++) {
    		if(i>=max && i<=num) {
    			f(num-i, i,n+1);
    		}
    	}
    }
}
