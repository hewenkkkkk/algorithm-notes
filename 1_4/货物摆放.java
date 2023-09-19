package 直播1_4;

import java.util.ArrayList;

public class 货物摆放 {

	static long n = 2021041820210418L;//2e15
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans = 0;
//		for(int i=1;i<=n;i++){//2e15   n^3  8e45 / 1e7~1e8  8e37
//			for(int j=1;j<=n;j++) {//2e15
//				for(int k=1;k<=n;k++) {//2e15
//					if(i*j*k==n)
//						ans++;
//				}
//			}
//		}
		/**n=6
		 * 1 2 3 6
		 * 116 123      161 611    132 213 231 312 321
		 * */
		ArrayList<Long> list = new ArrayList<>();
		//36  1  2  3  4  6  9  12  18  36   
		//1~根号n   根号n~n
		for(long i=1;i<=n/i;i++) {
			if(n%i==0) {
				if(i==n/i) {
					list.add(i);
					continue;
				}
				list.add(i);
				list.add(n/i);
			}
		}
		System.out.println(list.size());//128^3
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				for(int k=0;k<list.size();k++) {
					if(list.get(i)*list.get(j)*list.get(k)==n) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
