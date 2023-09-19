package 12_25;

import java.util.Calendar;

public class Εά²½ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 0, 1);
		int count = 0;
		while(cal.get(Calendar.YEAR)!=2023) {
			if(cal.get(Calendar.DAY_OF_WEEK)==7 || cal.get(Calendar.DAY_OF_WEEK)==1 || 
					cal.get(Calendar.DAY_OF_MONTH)==1 || cal.get(Calendar.DAY_OF_MONTH)==11 ||
					cal.get(Calendar.DAY_OF_MONTH)==21 || cal.get(Calendar.DAY_OF_MONTH)==31) {
				count++;
			}
			cal.add(Calendar.DATE, 1);
		}
		System.out.println(count);
	}

}
