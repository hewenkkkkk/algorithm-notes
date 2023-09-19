package 直播1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 迷宫dfs {
	static int num;//存储迷宫最短路径所需要的步数
	static int xsize = 30;//迷宫大小30行50列
	static int ysize = 50;
	static char[][] arr = new char[xsize][ysize];//存储迷宫：0表示路，1表示墙
	static boolean[][] help = new boolean[xsize][ysize];//判断此点是否已经做过
	static int[][] dir = {{1,0},{0,-1},{0,1},{-1,0}};//四个方向横纵坐标的变化量
	static char[] sign = {'D','L','R','U'};//表示四个方向
	static String run = "";
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i=0;i<xsize;i++) {
			arr[i] = in.readLine().toCharArray();
		}
		dfs(0,0);
	}
	private static void dfs(int i, int j) {
		if(i==xsize-1 && j==ysize-1) {
			System.out.println(run);
			return;
		}
		for(int k=0;k<4;k++){
			if(check(i+dir[k][0] , j+dir[k][1])) {
				run = run + sign[k];
				help[i+dir[k][0]][j+dir[k][1]] = true;
				dfs(i+dir[k][0], j+dir[k][1]);
				run = run.substring(0, run.length()-1);
			}
		}
//		if(check(i+dir[1][0] , j+dir[1][1])) {
//			run = run + sign[1];
//			help[i+dir[1][0]][j+dir[1][1]] = true;
//			dfs(i+dir[1][0], j+dir[1][1]);
//			run = run.substring(0, run.length()-1);
//		}
//		if(check(i+dir[2][0] , j+dir[2][1])) {
//			run = run + sign[2];
//			help[i+dir[2][0]][j+dir[2][1]] = true;
//			dfs(i+dir[2][0], j+dir[2][1]);
//			run = run.substring(0, run.length()-1);
//		}
//		if(check(i+dir[3][0] , j+dir[3][1])) {
//			run = run + sign[3];
//			help[i+dir[3][0]][j+dir[3][1]] = true;
//			dfs(i+dir[3][0], j+dir[3][1]);
//			run = run.substring(0, run.length()-1);
//		}
	}
	
	private static boolean check(int i, int j) {
		// TODO Auto-generated method stub
		return i<xsize && i>=0 && j<ysize && j>=0 && !help[i][j] && arr[i][j]=='0';
	}
}
