package 2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ջAC {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
	static int[] ans = {0,1,2,5,14,42,132,429,1430,4862,16796,58786,208012,742900,2674440,9694845,35357670,129644790,477638700};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(in.readLine());
		System.out.println(ans[n]);
	}

}
