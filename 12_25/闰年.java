package 直播12_25;

import java.util.Calendar;
import java.util.Scanner;

public class 闰年 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		//1.year能整除400
		//2.year能整数4,但是不能整除100
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		//1.12月31日是这一年的第366天
		//2.2月的天数,3月1日,减一天
		Calendar cal = Calendar.getInstance();
		cal.set(year, 11, 31);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)==366?"yes":"no");
		cal.set(year, 2, 1);
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)==29?"yes":"no");
	}

}
