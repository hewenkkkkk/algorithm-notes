package Ö±²¥12_25;

import java.util.Scanner;

public class ÔÂ·Ý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();//1-12
		int[] day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(day[month]);//0, 1-12
	}

}
