package Ö±²¥12_25;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double pi = 3.1415926535;
		int n = sc.nextInt();
		System.out.printf("%."+n+"f",pi);
	}
}
