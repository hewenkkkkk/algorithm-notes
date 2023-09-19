package 直播1_4;

public class 进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toString(a, 2));
		/**9/2  1
		 * 4/2  0
		 * 2/2  0
		 * 1/2  1  1001
		 * 0     
		 * */
		a = -9;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toString(a, 2));
		//原码
		//反码
		//补码
		/**正数 原码,反码,补码全部相同
		 * 00000000 00000000 00000000 00001001 第一位是符号位 0表示正数,1表示负数
		 * 负数  
		 * 10000000 00000000 00000000 00001001  原码-9
		 * 11111111 11111111 11111111 11110110  反码-9
		 * 11111111 11111111 11111111 11110111  补码-9
		 * */
	}

}
