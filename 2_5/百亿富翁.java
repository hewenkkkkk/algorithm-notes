package 2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;

public class 百亿富翁 {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(in.readLine());
		int[] l = new int[n];
		int[] r = new int[n];
		int[] num = new int[n];
		String[] s = in.readLine().split(" ");
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(s[i]);
			while(!stack.isEmpty() && num[stack.peek()]<=num[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				l[i] = -1;
			}else {
				l[i] = stack.peek() + 1;
			}
			stack.push(i);
		}
		stack.clear();//清空栈,避免对后面的操作造成影响
		for(int i=n-1;i>=0;i--) {
			while(!stack.isEmpty() && num[stack.peek()]<=num[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				r[i] = -1;
			}else {
				r[i] = stack.peek() + 1;
			}
			stack.push(i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(l[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(r[i]+" ");
		}
	}
}
