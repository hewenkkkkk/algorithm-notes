package 1_4;

import java.util.Arrays;
import java.util.Scanner;

public class ǰ׺�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] n = {1,2,3,4,5};//Sn Sn-2  An
		int[] add = new int[6];//ǰn�����ĺ� add[0] = 0
		for(int i=1;i<=5;i++) {
			add[i] = add[i-1] + n[i-1];
		}
		//System.out.println(Arrays.toString(add));
		//��a~b�ĺ�
		
		int a = sc.nextInt();//0~4
		int b = sc.nextInt();
		System.out.println(add[b+1]-add[a]);
	}

}
