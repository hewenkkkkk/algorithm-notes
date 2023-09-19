package Ö±²¥1_4;

public class ·ÖÊı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 1;
//		int fenzi = 0;
//		int fenmu = 0;
//		for(int i=1;i<=20;i++) {
//			if(i==1) {
//				fenzi = fenzi + n;
//				n = n * 2;
//				continue;
//			}
//			fenzi = fenzi + n;
//			if(i!=20)
//				n = n*2;
//		}
//		System.out.println(n);
//		System.out.println(fenzi);
//		
//		System.out.println(n/gcd(n,fenzi));
//		System.out.println(fenzi/gcd(n,fenzi));
		System.out.println(gcd(3, 6));
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		return b==0?a:gcd(b, a%b);
	}
	
}
