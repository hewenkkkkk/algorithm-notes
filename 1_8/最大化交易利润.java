package ֱ��1_8;

import java.util.Scanner;

public class ��󻯽������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//�������->�۸����ʱ���룬�۸����ʱ����
		//2 5 6 1 4 3 1 3
		//    * *
		//����������
		//�������ڣ��ҵ��������֮ǰ���۸���͵�ʱ������
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
