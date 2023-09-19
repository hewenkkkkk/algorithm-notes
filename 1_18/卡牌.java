package ֱ��1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//�������ƴ��4��,��ôҲ��ƴ��1,2,3��

public class ���� {
	static int n;//��������
	static long m;//�����д������
	static int[] num;//��ʼ��ÿһ���Ƶ�����
	static int[] max;//ÿһ����,���Ӷ�����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Long.parseLong(s[1]);//2000000000 2e9 2e10
		s = in.readLine().split(" ");
		num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		s = in.readLine().split(" ");
		max = new int[n];
		for(int i=0;i<n;i++) {
			max[i] = Integer.parseInt(s[i]);
		}
		int left = 0;
		int right = n;
		while(left<right) {
			int middle = (left+right+1)>>1;
			System.out.println();
			if(check(middle)) left = middle;//�ܴճ���
			/**ʲôʱ�����Ҫд+1
			 * �����м�ֵ��left��ʱ��
			 * Ŀ��:Ϊ�˱�����ѭ��
			 **/
			else right = middle-1;//�ղ�����
			//System.out.println("***********");
		}
		out.println(right);
		//out.println(left);
		out.flush();
	}

	//�ж��ܲ���ƴ��middle����
	private static boolean check(int middle) {//middle = 4
		// TODO Auto-generated method stub
		long value = m;//ʣ����ÿհ׿���
		/**4 5
			1 2 3 4
			5 5 5 5
		 * */
		/**13   2
		 * A 2 3 4 5 6 7 8 9 10 J Q K    2
		 * 2 4 2 2 2 4 2 4 1 2  4 3 4
		 * 2 2 2 3 1 2 2 2 1 2  2 1 1 
		 * */
		for(int i=0;i<n;i++) {
			if(num[i]>=middle) continue;//�Ѿ�����
			if(num[i]+max[i]<middle) return false;
			if(num[i]+max[i]>=middle && middle-num[i]<=value) {
				//1    2        2         2      1       >=1
				value = value - (middle-num[i]);
			}else {
				return false;
			}
		}
		return true;
	}
}