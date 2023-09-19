package 直播2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class CLZ银行问题 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		Queue<String> qv = new LinkedList<>();//VIP
	    Queue<String> qn = new LinkedList<>();//普通
	    int m = Integer.parseInt(in.readLine());
	    for(int i=0;i<m;i++){
			String[] s = in.readLine().split(" ");
			if(s[0].equals("IN")){
				if(s[2].equals("V")){
					qv.add(s[1]);
				}else{
				    qn.add(s[1]);
				}
			}else{
				if(s[1].equals("V")){
					qv.poll();
				}else{
					qn.poll();
				}
			}
	    }
	    int v = qv.size();//4
	    int n = qn.size();
	    for(int i=0;i<qv.size();i++){
	      System.out.println(qv.poll());
	    }
	    for(int i=0;i<n;i++){
	      System.out.println(qn.poll());//peek之获取不删除
	    }
	}

}
