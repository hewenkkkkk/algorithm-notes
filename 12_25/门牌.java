package 12_25;

public class цееф {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1;i<=2020;i++) {
			//1.
//			int n = i;
//			while(n!=0) {
//				//1234 123 12 1 0
//				if(n%10==2) {
//					count++;
//				}
//				n = n / 10;
//			}
			String s = i+"";//1234
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='2') {//char  equal
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
