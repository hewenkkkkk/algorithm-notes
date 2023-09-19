package 3_5;

import java.util.Scanner;

public class 最大数字 {
    static long ans = 0;
    static String a;
    static int n;
    static int m;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    a = scanner.next();
	    n = scanner.nextInt();
	    m = scanner.nextInt();
	    dfs(0,0);
	    System.out.println(ans);
	}
	private static void dfs(int i, long j) {//i是判断到了第几位，j是目前得到的结果
	    // TODO Auto-generated method stub
	    if(i<a.length()) {
	        int c = a.charAt(i)-'0';
	        //加操作
	        int t = Math.min(n, 9 - c);
	        n -= t;
	        dfs(i+1, j*10+c+t);//1 19
	        //回溯时，不要忘记复原n
	        n += t;
	        //减操作，判断是否可以进行，不可以就一步不可进行
	        if(m > c) {
	            m -= c+1;
	            dfs(i+1, j*10+9);
	            //回溯
	            m += c+1;
	        }    
	    }else {
	        ans = Math.max(ans, j);
	    }    
	}
}
/**
 * 1.加：是不是每一位能加到9，如果能，加到9就可以了，如果不能，就all in
 * 2.减：判断这一位需不需减，只有这一位可以减到9的时候才需要减，在能减的情况下，无论能减到多少，减到9就可以了
 * 如果不能减，就表示这一位目前的值，就是能得到的最大值
 */