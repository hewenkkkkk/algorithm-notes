package 1_29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ��ͬ�Ӵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0100110001010001";
		//String s = "aaab";
		Set<String> set = new TreeSet<>();
		for(int i=0;i<s.length();i++) {//��ͷ
			String m = "";
			for(int j=i;j<s.length();j++) {//��β
				m = m + s.charAt(j);//subString
				set.add(m);
				//String n = substring(i,j+1,s);
			}
		}
		System.out.println(set.size());
//		String[] a = set.toArray(new String[0]);//����ת����,���ͱ����ǰ�װ�� int Integer
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
	}

	private static String substring(int i, int j,String s) {
		// TODO Auto-generated method stub
		String m = "";
		for(int a=i;a<j;a++) {
			m = m + s.charAt(a);
		}
		return null;
	}
}
