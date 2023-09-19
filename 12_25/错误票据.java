package ÷±≤•12_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ¥ÌŒÛ∆±æ› {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(in.readLine());
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int i=0;i<n;i++) {
			String[] m = in.readLine().split(" ");
			for(int j=0;j<m.length;j++) {
				list.add(Integer.parseInt(m[j]));
			}
		}
		Collections.sort(list);//110 111 112 113 115 116 117 117 118 
		int m = 0;//∂œ∫≈
		int x = 0;//÷ÿ∫≈
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i+1)-list.get(i)==2) {
				m = list.get(i+1)-1;
			}
			if(list.get(i+1)-list.get(i)==0) {
				x = list.get(i);
			}
		}
		out.print(m+" "+x);
		out.flush();
	}

}
