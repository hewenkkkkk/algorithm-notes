package 2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class ���������Թ� {
	static int n;
	static int k;
	static char[][] w;//�洢�Թ�
	static boolean[][] help;//��ʾ�˵�С���Ƿ��Ѿ��߹�
	static int[] rec = new int[] { 2, 1, 0 };
	static int[] dx = new int[] { 1, 0, -1, 0 };
    static int[] dy = new int[] { 0, 1, 0, -1 };
	static Queue<Node> q = new LinkedList<>();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] arr = in.readLine().split(" ");
        n = Integer.parseInt(arr[0]);
        k = Integer.parseInt(arr[1]);
        w = new char[n][n];
        help = new boolean[n][n];
        for (int i = 0; i < n; i++)
            w[i] = in.readLine().toCharArray();
        q.add(new Node(2, 2, 0));//���Թ����洢��������
        help[2][2] = true;//�������Ϊ�Ѿ��߹���
        bfs();
        out.flush();
	}
	private static void bfs() throws IOException { 
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			Node now = q.poll();//��ȡС����ǰ���ڵ����Ϣ
			int x = now.x;
			int y = now.y;
			int t = now.t;
			if (x == n - 3 && y == n - 3) { // �Ѿ��������
                out.println(t);
                return;
            }
            if (t / k < 2) // ����ԭ�أ�ʱ�̼� 1 ,���t>=2k�� 1*1
                q.add(new Node(x, y, t + 1));
            for (int i = 0; i < 4; i++) {//���ĸ���������ж�
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nt = (t / k) > 2 ? 0 : rec[t / k]; // ��ֹ�±�Խ��
                if (nx - nt < 0 || nx + nt >= n || ny - nt < 0 || ny + nt >= n || help[nx][ny])//�жϴ˵��Ƿ����Թ���Χ�ڣ��Ҵ˵��Ƿ��Ѿ��߹���
                    continue;
                boolean flag = true; // �Ƿ����ߵ�
                for (int j = nx - nt; j <= nx + nt; j++) {//�ж�С��ռ�ݵ�λ�����Ƿ���*
                    for (int m = ny - nt; m <= ny + nt; m++) {
                        if (w[j][m] == '*') {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {//С�������ߵ�
                    help[nx][ny] = true;
                    q.add(new Node(nx, ny, t + 1));//��С������ĵ�洢��������
                }
            }
		}
	}
}
class Node{
	int x;
	int y;
	int t;
	public Node(int x,int y,int t) {
		this.x = x;
		this.y = y;
		this.t = t;
	}
}