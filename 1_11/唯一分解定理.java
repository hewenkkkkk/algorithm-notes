package ֱ��1_11;

import java.util.Scanner;

public class Ψһ�ֽⶨ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int m = n;
		for(int i=2;i<=n/i;i++) {//ÿһ����,�������ֻ��һ���������Ǵ��ڸ���n��
			int sum = 0;//n����������i
			//36 
			while(n%i==0) {
				sum++;//1 2    1 2
				n/=i;//18 9    3 1   2*2*3*3=36  2^2*3^2 = 36
			}
			if(sum!=0)
				System.out.println(i+"^"+sum);
		}
		if(n>1) {//����->ÿһ����,�������ֻ��һ���������Ǵ��ڸ���n��
			System.out.println(n+"^"+1);
			System.out.println("******");
		}
	}

}
