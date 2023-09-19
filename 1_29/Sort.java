package 直播1_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=10;i>=0;i--) {
			list.add(i);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -1;//如果是正数或者0,sort排序从小到大,如果是负数,从大到小
			}
		});
		System.out.println(list);
		Collections.sort(list,(Integer o1,Integer o2)->(o2-o1));
		System.out.println(list);
	}

}
