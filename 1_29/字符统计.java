package 1_29;

import java.util.Arrays;
import java.util.Scanner;

public class ×Ö·ûÍ³¼Æ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] num = new int[26];
		int max = 0;
		for(int i=0;i<s.length();i++) {
			num[s.charAt(i)-'A']++;//A->0  B->1
			if(max<num[s.charAt(i)-'A'])
				max = num[s.charAt(i)-'A'];
		}
//		System.out.println(Arrays.toString(num));
//		System.out.println(max);
		for(int i=0;i<26;i++) {
			if(num[i]==max)
				System.out.print((char)(65+i));//0->48 A->65 a->97
		}
	}

}
