package 2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class �����׶�԰ {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int[] p;//p[i]��ʾi��ͷ�����p[i]
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		p = new int[n+1];
		for(int i=1;i<=n;i++) {
			p[i] = i;//��i��С���ѵĸ��ڵ�
		}
		for(int i=0;i<m;i++) {
			s = in.readLine().split(" ");
			int op = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			int y = Integer.parseInt(s[2]);
			if(op==1) {
				p[find(y)] = find(x);
			}else {
				System.out.println(find(x)==find(y)?"YES":"NO");
			}
		}
	}
	static int find(int x) {//��һ�ε�ʱ��x=3 ��p[1] = 1
		if(p[x]!=x)//��㲻���Լ� p[3] = 1 p[1] = 1
			p[x]=find(p[x]);
		return p[x];
	}
}
