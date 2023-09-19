package Ö±²¥1_11;

public class ÊıÊı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [2333333, 23333333]
		long ans = 0;
		for(int i=2333333;i<=23333333;i++) {
			if(check(i)==12) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	private static int check(int n) {
		// TODO Auto-generated method stub
		int m = n;
		int sum = 0;
		for(int i=2;i<=m/i;i++) {//120 2*2*2*3*5
			while(n%i==0) {//2*2*2*2*2*2*2*2*2*2*2*2*2
				sum++;
				n/=i;
			}
		}
		if(n>1)
			sum++;
		return sum;
	}

}
