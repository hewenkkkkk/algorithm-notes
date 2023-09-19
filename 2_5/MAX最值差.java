package 直播2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class MAX最值差 {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]); 
        int[] m = new int[n+1];
        s = in.readLine().split(" ");
		for(int i=1;i<=n;i++) {
			m[i] = Integer.parseInt(s[i-1]);
		}
		ArrayDeque<Integer> q1 = new ArrayDeque<>();
		ArrayDeque<Integer> q2 = new ArrayDeque<>();
		ArrayList<Integer> max = new ArrayList<>();
		ArrayList<Integer> min = new ArrayList<>();
		long ans = 0;
		for(int i=1;i<=n;i++) {//k=3 i=4 i=1
			//如果前一个数比我大,那么只要有我在,前一个数,就不可能是这个区间里的最小值
			if(!q1.isEmpty() && q1.peekFirst()<i-k) {
				q1.pollFirst();
			}
			while(!q1.isEmpty() && m[q1.peekFirst()] > m[i]) {//4 > 2
				q1.pollLast();
			}
			q1.addLast(i);//1 2 3 
			min.add(q1.peekFirst());
			//****************************//
			//如果前一个数比我小,那么只要有我在,前一个数,就d不可能是这个区间里的最大值
			if(!q2.isEmpty() && q2.peekFirst() < i-k) {
				q2.pollFirst();
			}
			while(!q2.isEmpty() && m[q2.peekLast()] < m[i]) {
				q2.pollLast();
			}
			q2.addLast(i);//2 3
			max.add(q2.peekFirst());
			ans = Math.max(ans, m[max.get(i-1)]-m[min.get(i-1)]);
		}
		System.out.println(ans);
	}
}
