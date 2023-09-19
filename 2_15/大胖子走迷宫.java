package 2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 大胖子走迷宫 {
	static int n;
	static int k;
	static char[][] w;//存储迷宫
	static boolean[][] help;//表示此点小明是否已经走过
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
        q.add(new Node(2, 2, 0));//将迷宫起点存储到队列中
        help[2][2] = true;//设置起点为已经走过了
        bfs();
        out.flush();
	}
	private static void bfs() throws IOException { 
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			Node now = q.poll();//获取小明当前所在点的信息
			int x = now.x;
			int y = now.y;
			int t = now.t;
			if (x == n - 3 && y == n - 3) { // 已经到达出口
                out.println(t);
                return;
            }
            if (t / k < 2) // 待在原地，时刻加 1 ,如果t>=2k， 1*1
                q.add(new Node(x, y, t + 1));
            for (int i = 0; i < 4; i++) {//对四个方向进行判断
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nt = (t / k) > 2 ? 0 : rec[t / k]; // 防止下标越界
                if (nx - nt < 0 || nx + nt >= n || ny - nt < 0 || ny + nt >= n || help[nx][ny])//判断此点是否在迷宫范围内，且此点是否已经走过了
                    continue;
                boolean flag = true; // 是否能走到
                for (int j = nx - nt; j <= nx + nt; j++) {//判断小明占据的位置中是否有*
                    for (int m = ny - nt; m <= ny + nt; m++) {
                        if (w[j][m] == '*') {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {//小明可以走到
                    help[nx][ny] = true;
                    q.add(new Node(nx, ny, t + 1));//将小明到达的点存储到队列中
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