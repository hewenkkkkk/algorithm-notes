package 1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class �Թ�bfs {
	static int num;//�洢�Թ����·������Ҫ�Ĳ���
	static int xsize = 30;//�Թ���С30��50��
	static int ysize = 50;
	static char[][] arr = new char[xsize][ysize];//�洢�Թ���0��ʾ·��1��ʾǽ
	static boolean[][] help = new boolean[xsize][ysize];//�жϴ˵��Ƿ��Ѿ�����
	static int[][] dir = {{1,0},{0,-1},{0,1},{-1,0}};//�ĸ������������ı仯��
	static char[] sign = {'D','L','R','U'};//��ʾ�ĸ�����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<xsize;i++){
			arr[i] = in.readLine().toCharArray();
		}
		out.println(bfs());
		out.print(num);
		out.flush();
	}
	
	private static String bfs() {
		// TODO Auto-generated method stub
		Queue<Node> list = new LinkedList<>();//����
		int x = 0;
		int y = 0;
		int runnum = 0;
		list.add(new Node(x,y,"",runnum));//�����洢��������
		while(!list.isEmpty()){//�ж϶����Ƿ�Ϊ�գ���Ϊ�գ�����Թ�û��ͨ·
			Node now = list.poll();//��ȡ�����еĵ�һ��Ԫ�ز�ɾ��
			help[now.x][now.y] = true;//���˵���Ϊ�Ѿ��߹�
			for(int i=0;i<4;i++){//ѭ���ĴΣ����ĸ�������д���
				int xx = now.x + dir[i][0];//�ƶ����x����
				int yy = now.y + dir[i][1];//�ƶ����y����
				if(check(xx,yy) && help[xx][yy]==false && arr[xx][yy]=='0'){//�˵����Թ���Χ�ڣ�δ�߹�������ǽ
					list.add(new Node(xx,yy,now.num + sign[i],now.runnum + 1));//���˵���������
					if(xx==xsize-1 && yy==ysize-1){//����Ѿ������Թ��յ�
						num = now.runnum + 1;//���貽��+1��now.runnum�ǵ����Թ��յ�ǰһ������Ҫ�Ĳ�����
						return now.num + sign[i];//����ͨ���Թ��ķ�ʽ
					}
				}
			}
		}
		return "";//���ַ�������ʾ���Թ���ͨ·
	}

	private static boolean check(int xx, int yy) {//�жϴ˵��Ƿ����Թ���Χ��
		// TODO Auto-generated method stub
		return xx>=0 && yy>=0 && xx<xsize && yy<ysize;
	}
}

class Node{
	int x;//x����
	int y;//y����
	int runnum;//����˵���̲���
	String num;//����˵�ķ�ʽ
	public Node(int x, int y,String num ,int runnum) {
		super();
		this.x = x;
		this.y = y;
		this.num = num;
		this.runnum = runnum;
	}
}
