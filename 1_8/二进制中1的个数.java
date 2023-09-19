package 直播1_8;

import java.util.Scanner;

public class 二进制中1的个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//1.
		System.out.println(Integer.bitCount(x));
		//2.
		String string = Integer.toBinaryString(x);
		//Integer.toString(x, 2);
		System.out.println(string);
		int count = 0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='1')
				count++;
		}
		System.out.println(count);
		//3.
		//11111111111111111111111111110111
		//1111111111111111111111111111011
		//111111111111111111111111111101
		int num = 0;
		for(int i=0;i<32;i++) {
			if(((x>>i)&1)==1) {
				num++;
			}
		}
		System.out.println(num);
	}

}
