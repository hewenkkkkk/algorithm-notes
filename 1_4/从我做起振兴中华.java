package 1_4;

public class 从我做起振兴中华 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(3,4));//f(a,b)  我到达a,b点的时候,可能方式个数
		//2019!!  2019*2017*2015*2013*...*3*1
		System.out.println(a(2019));//a的双阶乘的值
	}

	private static long a(int i) {
		// TODO Auto-generated method stub
		if(i==1)
			return 1;
		return i * a(i-2);//3 * 1!! = 3 * 1
	}

	private static int f(int i, int j) {
		// TODO Auto-generated method stub
		if(i==0 && j==0)
			return 1;
		if(i==0)
			return f(i, j-1);
		if(j==0)
			return f(i-1, j);
		return f(i-1, j) + f(i, j-1);
	}
/**f(3,4)
 * f(2,4)+f(3,3)
 * f(1,4)+f(2,3)	+	f(2,3)+f(3,2)
 * f(0,4)+f(1,3)	+	f(1,3)+f(2,2)	+	f(1,3)+f(2,2)	+	f(2,2)+f(3,1)
 * f(0,3)	+	f(0,3)+f(1,2)	+	f(0,3)+f(1,2)	+	f(1,2)+f(2,1)	+	
 * 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1...   35 	
 * */
}
