package 2_19;

public class 最长上升子序列 {
	public static void main(String[] args) {
		int[] ans = {0,1,4,2,2,5,6};
		int[] dp = new int[ans.length];
		dp[0] = 0;
		int num  = 0;
		for(int i=1;i<=6;i++) {
			int max = 0;//前面的最大dp值
			for(int j=1;j<=i;j++) {//判断前面的数
				if(ans[i]>ans[j]) {//保证上升
					if(dp[j]>max)
						max = dp[j];//在保证上升的前提之下，找到最大值
				}
				dp[i] = max+1;//长度加上i本身
			}
			num = Math.max(max, dp[i]);
		}
		System.out.println(num);
	}
}
