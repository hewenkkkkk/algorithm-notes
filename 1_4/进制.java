package ֱ��1_4;

public class ���� {

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
		//ԭ��
		//����
		//����
		/**���� ԭ��,����,����ȫ����ͬ
		 * 00000000 00000000 00000000 00001001 ��һλ�Ƿ���λ 0��ʾ����,1��ʾ����
		 * ����  
		 * 10000000 00000000 00000000 00001001  ԭ��-9
		 * 11111111 11111111 11111111 11110110  ����-9
		 * 11111111 11111111 11111111 11110111  ����-9
		 * */
	}

}
