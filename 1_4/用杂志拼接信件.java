package 直播1_4;

import java.util.Scanner;

public class 用杂志拼接信件 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();//遇到空格或者换行都停止   abcd edf
		String b = sc.next();//只有遇到换行的时候停止,可以读取换行符  
		//int a = sc.nextInt();
		//sc.nextLine();吸收回车符
		//String s = sc.nextLine();   sc.next()
		int[] num = new int[26];//0->a 1->b   25->z
		for(int i=0;i<a.length();i++) {
			num[a.charAt(i)-'a']++;//'a'   
		}
		for(int i=0;i<b.length();i++) {
			num[b.charAt(i)-'a']--;//剩余的数量  aba aab
			if(num[b.charAt(i)-'a']<0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
