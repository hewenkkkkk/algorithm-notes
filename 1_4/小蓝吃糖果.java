package 1_4;

import java.util.Scanner;

public class С�����ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//1e6  1*10^6
		int[] num = new int[n];//1e6
		long all = 0;//�����ǹ����ܺ�  1e6*1e6 = 1e12  int_max = 2e9
		int max = 0;//�����Ǹ��ǹ���
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
			if(num[i]>max)
				max = num[i];
			all = all + num[i];
		}
		System.out.println((max+1)>(all-max)?"No":"Yes");
		//max>all-max
	}

}
