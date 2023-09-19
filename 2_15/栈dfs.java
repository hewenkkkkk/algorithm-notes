package 2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 栈dfs {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
	static int[] a = new int[100];
	static int num = 0;
	static int x;
	static int y;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		y = Integer.parseInt(in.readLine());
		x = 2 * y;//操作的数量  
		dfs(0);
		System.out.println(num);
	}

	static void dfs(int n) {
		if(n==x){
			num++;
			return;
		}
		int[] b = {0,1};
		for(int i=0;i<2;i++){
			a[n]=b[i];
			if(judge(n))
				dfs(n+1);
			a[n]=0;
		}
	}

	static boolean judge(int n) {
		int num1=0,num2=0;
		for(int i=0;i<=n;i++){
			if(a[i]==0)//0代表入栈，1代表出栈
				num1++;
			else
				num2++;
			if(num1>y)
				return false;
		}
		if(num1<num2)
			return false;
		else
			return true;
	}
}
