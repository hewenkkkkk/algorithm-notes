package ֱ��2_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class �ϳ����� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split(" ");
		int[] nums = new int[n];
		int[] left = new int[n];//���ҵ������
		int[] right = new int[n];//���ҵ���������
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
		for(int i = 0; i < n; i++) {
			 left[i] = 1;
			 for(int j = i-1; j >= 0; j--) {
				 if(nums[i]>nums[j]) 
					 left[i] = Math.max(left[i], left[j]+1);
			 }
		 }
		
		 for(int i = n-1; i >= 0; i--) {
			 right[i] = 1;
			 for(int j = i+1; j < n; j++) {
				 if(nums[i]>nums[j]) 
					 right[i] = Math.max(right[i], right[j]+1);
			 }
		 }
		 int max = -1;
		 for(int i=0;i<n;i++) {
			 max = Math.max(max, left[i] + right[i] - 1);//�ҵ����������Ķ�������ж��ٸ���
		 }
		 System.out.println(n-max);
	}
}
