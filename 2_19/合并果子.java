package ֱ��2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class �ϲ����� {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		String[] s = in.readLine().split(" ");
		PriorityQueue<Integer> queue = new PriorityQueue<>();//�����Ƚ��ȳ������ȶ���С���ȳ�
		for(int i=0;i<n;i++) {
			queue.add(Integer.parseInt(s[i]));
		}
		//����������һ�ѣ�һ���Ǻϲ��Ĵ���Ҫ���٣�ÿһ�ΰ��������ٵ����Ѻϲ���һ�ѣ�
		//�������ܱ�֤ÿһ�κϲ����ĵ�����ֵ������С�ģ����ս��Ҳ����С��
		int num = 0;
		while(queue.size()!=1) {
			int x = queue.poll();
			int y = queue.poll();
			int sum = x+y;
			queue.add(sum);
			num = num + sum;//ÿһ�ΰѺķѵ�����ֵ������
		}
		System.out.println(num);
	}
}
