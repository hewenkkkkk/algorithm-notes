package ֱ��12_25;

import java.util.Calendar;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		//1.year������400
		//2.year������4,���ǲ�������100
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		//1.12��31������һ��ĵ�366��
		//2.2�µ�����,3��1��,��һ��
		Calendar cal = Calendar.getInstance();
		cal.set(year, 11, 31);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)==366?"yes":"no");
		cal.set(year, 2, 1);
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)==29?"yes":"no");
	}

}
