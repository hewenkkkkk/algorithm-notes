package 直播1_11;

import java.util.Scanner;

public class 唯一分解定理 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int m = n;
		for(int i=2;i<=n/i;i++) {//每一个数,有且最多只有一个质因子是大于根号n的
			int sum = 0;//n能整除几次i
			//36 
			while(n%i==0) {
				sum++;//1 2    1 2
				n/=i;//18 9    3 1   2*2*3*3=36  2^2*3^2 = 36
			}
			if(sum!=0)
				System.out.println(i+"^"+sum);
		}
		if(n>1) {//处理->每一个数,有且最多只有一个质因子是大于根号n的
			System.out.println(n+"^"+1);
			System.out.println("******");
		}
	}

}
