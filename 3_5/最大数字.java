package 3_5;

import java.util.Scanner;

public class ������� {
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
	private static void dfs(int i, long j) {//i���жϵ��˵ڼ�λ��j��Ŀǰ�õ��Ľ��
	    // TODO Auto-generated method stub
	    if(i<a.length()) {
	        int c = a.charAt(i)-'0';
	        //�Ӳ���
	        int t = Math.min(n, 9 - c);
	        n -= t;
	        dfs(i+1, j*10+c+t);//1 19
	        //����ʱ����Ҫ���Ǹ�ԭn
	        n += t;
	        //���������ж��Ƿ���Խ��У������Ծ�һ�����ɽ���
	        if(m > c) {
	            m -= c+1;
	            dfs(i+1, j*10+9);
	            //����
	            m += c+1;
	        }    
	    }else {
	        ans = Math.max(ans, j);
	    }    
	}
}
/**
 * 1.�ӣ��ǲ���ÿһλ�ܼӵ�9������ܣ��ӵ�9�Ϳ����ˣ�������ܣ���all in
 * 2.�����ж���һλ�費�����ֻ����һλ���Լ���9��ʱ�����Ҫ�������ܼ�������£������ܼ������٣�����9�Ϳ�����
 * ������ܼ����ͱ�ʾ��һλĿǰ��ֵ�������ܵõ������ֵ
 */