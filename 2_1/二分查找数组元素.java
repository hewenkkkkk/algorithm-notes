package 2_1;

import java.util.Scanner;

public class ���ֲ�������Ԫ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] data = new int[200];
		for(int i = 0 ; i < 200 ; i ++)
			data[i] = 4 * i + 6;
		int n = sc.nextInt();
		int l = 0;
		int r = 199;
		//���=�����������if����else�������һ��,��������ֱ��дl<r
		//���=��һ�����������,����Ҫ����дl<=r
		while(l<r) {
			int mid = (l+r)>>1;
			if(data[mid]>=n) 
				r = mid;
			else //data[mid]<n
				l = mid + 1;
		}
		//System.out.println(r);
		l = 0;
		r = 199;
		while(l<=r) {
			int mid = (l+r)>>1;
			System.out.println(l+" "+mid+" "+r);
			if(data[mid]==n) {
				System.out.println(mid);
				return;
			}else if(data[mid]>n)
				r = mid - 1;
			else 
				l = mid + 1;
		}
	}
}
