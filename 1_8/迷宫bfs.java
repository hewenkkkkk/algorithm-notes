package 1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 迷宫bfs {
	static int num;//存储迷宫最短路径所需要的步数
	static int xsize = 30;//迷宫大小30行50列
	static int ysize = 50;
	static char[][] arr = new char[xsize][ysize];//存储迷宫：0表示路，1表示墙
	static boolean[][] help = new boolean[xsize][ysize];//判断此点是否已经做过
	static int[][] dir = {{1,0},{0,-1},{0,1},{-1,0}};//四个方向横纵坐标的变化量
	static char[] sign = {'D','L','R','U'};//表示四个方向
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
		Queue<Node> list = new LinkedList<>();//队列
		int x = 0;
		int y = 0;
		int runnum = 0;
		list.add(new Node(x,y,"",runnum));//将起点存储到队列中
		while(!list.isEmpty()){//判断队列是否为空，若为空，则此迷宫没有通路
			Node now = list.poll();//获取队列中的第一个元素并删除
			help[now.x][now.y] = true;//将此点标记为已经走过
			for(int i=0;i<4;i++){//循环四次，对四个方向进行处理
				int xx = now.x + dir[i][0];//移动后的x坐标
				int yy = now.y + dir[i][1];//移动后的y坐标
				if(check(xx,yy) && help[xx][yy]==false && arr[xx][yy]=='0'){//此点在迷宫范围内，未走过，不是墙
					list.add(new Node(xx,yy,now.num + sign[i],now.runnum + 1));//将此点存入队列中
					if(xx==xsize-1 && yy==ysize-1){//如果已经到了迷宫终点
						num = now.runnum + 1;//所需步数+1（now.runnum是到达迷宫终点前一步所需要的步数）
						return now.num + sign[i];//返回通过迷宫的方式
					}
				}
			}
		}
		return "";//空字符串，表示此迷宫无通路
	}

	private static boolean check(int xx, int yy) {//判断此点是否在迷宫范围内
		// TODO Auto-generated method stub
		return xx>=0 && yy>=0 && xx<xsize && yy<ysize;
	}
}

class Node{
	int x;//x坐标
	int y;//y坐标
	int runnum;//到达此点最短步数
	String num;//到达此点的方式
	public Node(int x, int y,String num ,int runnum) {
		super();
		this.x = x;
		this.y = y;
		this.num = num;
		this.runnum = runnum;
	}
}
