package ֱ��1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class �Թ�dfs {
	static int num;//�洢�Թ����·������Ҫ�Ĳ���
	static int xsize = 30;//�Թ���С30��50��
	static int ysize = 50;
	static char[][] arr = new char[xsize][ysize];//�洢�Թ���0��ʾ·��1��ʾǽ
	static boolean[][] help = new boolean[xsize][ysize];//�жϴ˵��Ƿ��Ѿ�����
	static int[][] dir = {{1,0},{0,-1},{0,1},{-1,0}};//�ĸ������������ı仯��
	static char[] sign = {'D','L','R','U'};//��ʾ�ĸ�����
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
