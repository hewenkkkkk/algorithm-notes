package Ö±²¥1_8;

import java.util.Scanner;

public class ÎÚÍĞ°îÊ÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = 1;
		for(int i=0;i<x;i++) {
			if((i&1)==0) {
				ans = ans << 1;
			}else {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
