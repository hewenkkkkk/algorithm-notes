package 12_25;

import java.util.Calendar;

public class ¹úÇì {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(1949, 9, 1);
		int count = 0;
		while(cal.get(Calendar.YEAR)!=2022) {
			cal.add(Calendar.DATE, 1);
			count++;
		}
		System.out.println(count);
	}

}
