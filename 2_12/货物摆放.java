package 直播2_12;

import java.util.ArrayList;

public class 货物摆放 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 2021041820210418L;//2e15*2e15*2e15  8e45  1e7~1e8   8e38
		long ans = 0;
		ArrayList<Long> list = new ArrayList<>(); //36 18 4 5
		for(long i=1;i<=n/i;i++) {
			if(n%i==0) {
				if(i*i==n) {
					list.add(i);
					continue;
				}
				list.add(i);
				list.add(n/i);
			}
		}//1 1 4     4 1 1     1 4 1
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {//6   123 132 213 231 312 321    116   
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
