package 2_19;

public class ����������� {
	public static void main(String[] args) {
		int[] ans = {0,1,4,2,2,5,6};
		int[] dp = new int[ans.length];
		dp[0] = 0;
		int num  = 0;
		for(int i=1;i<=6;i++) {
			int max = 0;//ǰ������dpֵ
			for(int j=1;j<=i;j++) {//�ж�ǰ�����
				if(ans[i]>ans[j]) {//��֤����
					if(dp[j]>max)
						max = dp[j];//�ڱ�֤������ǰ��֮�£��ҵ����ֵ
				}
				dp[i] = max+1;//���ȼ���i����
			}
			num = Math.max(max, dp[i]);
		}
		System.out.println(num);
	}
}
