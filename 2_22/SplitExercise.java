package Ö±²¥2_22;

public class SplitExercise {
	public static void main(String[] args) {
		String a = "abcd bcde cdef";
		String[] s = a.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	}
}
