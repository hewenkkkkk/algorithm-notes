package Ö±²¥1_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ÐÇÆÚ¼ÆËã {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		int mod = 0;
		int a = 1; 
		for(int i=0;i<22;i++) {
			a = (a * 20) % 7;
		}
		System.out.println(a);
		System.out.println((a+6)%7==0?7:(a+6)%7);
	}
}
