package 1_29;

import java.util.Scanner;

public class ����ִ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		//16 0~9+a~f
		//26 0~9+a~p
		String m = Integer.toString(a, 26).toUpperCase();//��д
		for(int i=0;i<m.length();i++) {
			if(m.charAt(i)>='A' && m.charAt(i)<='P') {//ע������ifֻ�ܽ�ȥһ��
				//�������д��ǰ��,���������else,������ת���Ľ����һ��ת��
				System.out.print((char)(m.charAt(i)+9));//A->10 A->1
			}
			if(m.charAt(i)>='0' && m.charAt(i)<='9') {//1->1 A->1
				System.out.print((char)(m.charAt(i)+(65-49)));//A65->1(49) 
			}
		}
	}
//A 1
//B 2
//	3
//	4
//	5
//	6
//G	7
//H	8
//	9
//J	10
//K	11
//	12
//	13
//	14
//	15
//P	16
//	17
//	18
//	19
//	20
//	21
//	22
//	23
//	24
//	25
//	26
}
