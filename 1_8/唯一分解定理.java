package 1_8;

import java.util.Arrays;
import java.util.Scanner;

public class Ψһ�ֽⶨ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] ans = new int[x+1];//ans[i]��ʾ����i��������ans[i]�� 
		for(int i=2;i<=x/i;i++) {
			while(x%i==0) {
				x = x / i;
				ans[i]++;
			}
		}
		if(x>1) {
			ans[x]++;
		}
		System.out.println(Arrays.toString(ans));
	}

}
