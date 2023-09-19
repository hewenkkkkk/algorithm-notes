package 12_25;

import java.util.Calendar;
import java.util.Scanner;

public class ÌìÊý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(2021, month, 1);
		cal.add(Calendar.DATE,-1);
		//2021 8 31
		//2021 9 1
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
