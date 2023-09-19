package 2_12;

import java.util.Scanner;

public class ³É¼¨·ÖÎö {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double average = 0.0;
		int max = 0;
		int min = 100;
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			if(m>max)
				max = m;
			if(m<min)
				min = m;
			average = average + m;
		}
		System.out.println(max);
		System.out.println(min);
		System.out.printf("%.2f",average/n);
	}
}
