package 2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 数位排序 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		int n = Integer.parseInt(in.readLine());
//		int m = Integer.parseInt(in.readLine());
		ArrayList<Integer> list = new ArrayList<>();
//		for(int i=1;i<=n;i++) {
//			list.add(i);
//		}
		int[] n = new int[20];
		list.add(2022);
		list.add(409);
		list.add(6);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {//o1>o2
				// TODO Auto-generated method stub
				int x = o1;
				int y = o2;
				int sumx = 0;//x的数位和
				int sumy = 0;//y的数位和
				while(x!=0) {//1234 
					sumx = sumx + x%10;
					x/=10;
				}
				while(y!=0) {
					sumy = sumy + y%10;
					y/=10;
				}
				if(sumx>sumy) {//数位和小的在前
					return 1;
				}else if(sumx<sumy) {
					return -1;
				}else {//数位和相同
					x = o1;
					y = o2;
					return x>y?1:-1;
				}
			}
		});
		System.out.println(list);
		//Collections.sort(list,(Integer o1,Integer o2)->(-1));
	}

}
