package ֱ��1_4;

import java.util.Scanner;

public class ����־ƴ���ż� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();//�����ո���߻��ж�ֹͣ   abcd edf
		String b = sc.next();//ֻ���������е�ʱ��ֹͣ,���Զ�ȡ���з�  
		//int a = sc.nextInt();
		//sc.nextLine();���ջس���
		//String s = sc.nextLine();   sc.next()
		int[] num = new int[26];//0->a 1->b   25->z
		for(int i=0;i<a.length();i++) {
			num[a.charAt(i)-'a']++;//'a'   
		}
		for(int i=0;i<b.length();i++) {
			num[b.charAt(i)-'a']--;//ʣ�������  aba aab
			if(num[b.charAt(i)-'a']<0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
