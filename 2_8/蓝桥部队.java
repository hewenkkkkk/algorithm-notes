package 2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ���Ų��� {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int[] f;//��Ŵ��е���ͷԪ��
	static int[] length;//��Ŵ��еľ�������
	static int[] num;//�˾����Ǵ��еڼ���
	public static void main(String[] args) throws IOException{
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		f = new int[n+1];
		length = new int[n+1];
		num = new int[n+1];
		for(int i=1;i<=n;i++) {
			f[i] = i;
			length[i] = 1;
		}
		for(int i=0;i<m;i++) {
			s = in.readLine().split(" ");
			int op = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			int y = Integer.parseInt(s[2]);
			if(op==1) {//�ϲ�x��y������ x��y���� 
				and(x, y);
			}else {//��x��y���
				if(find(x)!=find(y)) {
					System.out.println(-1);
				}else {
					System.out.println(Math.abs(num[x]-num[y])-1);
				}
			}
		}
	}
	
	static void and(int x,int y) {
		x = find(x);//����x����ͷ
		y = find(y);//����y����ͷ
		if(x==y)//����������жϣ�ֻ�ܹ�20%�����ܰ��Ѿ���һ������кϲ�
			return;
		num[x] = num[x] + length[y];//x��y�ĺ��棬��������x����һ�еĵڼ�������Ҫ����y������һ���ж��ٸ���
		length[y] = length[y] + length[x];//x��y�кϲ�����һ�е�����������
		f[x] = y;//x������һ�е���ͷ��y
	}
	
	static int find(int x) {
		if(x!=f[x]) {//x����x�����е���ͷ
			int root = find(f[x]);//�ݹ��ҵ�x�����е���ͷ��˭
			num[x] = num[x] + num[f[x]];//����x����һ�еĵڼ����ˣ�����ԭ��x����һ�еĵڼ������ټ���x����ͷ����һ�еĵڼ���
			return f[x] = root;
		}
		return f[x];
	}
}
