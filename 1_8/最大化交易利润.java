package 直播1_8;

import java.util.Scanner;

public class 最大化交易利润 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//利润最大化->价格最低时买入，价格最高时卖出
		//2 5 6 1 4 3 1 3
		//    * *
		//买入后才能卖
		//卖出日期，找到这个日期之前，价格最低的时候买入
		int n = sc.nextInt();
		int[] num = new int[n];
		int ans = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
			if(num[i]-min>ans) {
				ans = num[i] - min;
			}
			min = Math.min(min, num[i]);
		}
		System.out.println(ans);
	}

}
