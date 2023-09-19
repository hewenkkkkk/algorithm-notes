package 2_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class 通电 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(in.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		for(int i=0;i<n;i++){
			String[] s = in.readLine().split(" ");
			x[i] = Integer.parseInt(s[0]);
			y[i] = Integer.parseInt(s[1]);
			z[i] = Integer.parseInt(s[2]);
		}
		double[][] edge = new double[n][n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double e = Math.sqrt(Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]),2)) + Math.pow((z[i]-z[j]),2);
				edge[i][j] = e;
				edge[j][i] = e;
			}
		}
		ArrayList<Integer> listU = new ArrayList<>();
		ArrayList<Integer> listV = new ArrayList<>();
		listU.add(0);
		for(int i=1;i<n;i++){
			listV.add(i);
		}
		double min;//两个集合之间的最短距离
		int form = -1;//起点
		int to = -1;//终点
		double sum = 0;
		while(!listV.isEmpty()) {
			min = Double.MAX_VALUE;
			for(int i:listU) {
				for(int j:listV) {
					if(edge[i][j]!=0 && edge[i][j]<min) {
						min = edge[i][j];
						form = i;
						to = j;
					}
				}
			}
			if(min==Double.MAX_VALUE) {
				System.out.println("-1");
				return;
			}
			listU.add(to);
			listV.remove(new Integer(to));
			sum = sum + edge[form][to];
		}
		out.printf("%.2f",sum);
		out.flush();
	}
}