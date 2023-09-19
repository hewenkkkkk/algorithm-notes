package 2_26;

public class reverse {
	public static void main(String[] args) {
		String s = "123454321";
		StringBuffer t = new StringBuffer(s);
		System.out.println(t.reverse().toString().equals(s));
		
	}
}
