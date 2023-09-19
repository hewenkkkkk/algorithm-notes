package 直播2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 合并果子 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		String[] s = in.readLine().split(" ");
		PriorityQueue<Integer> queue = new PriorityQueue<>();//队列先进先出，优先队列小的先出
		for(int i=0;i<n;i++) {
			queue.add(Integer.parseInt(s[i]));
		}
		//数量最多的那一堆，一定是合并的次数要最少，每一次把数量最少的两堆合并成一堆，
		//这样就能保证每一次合并消耗的体力值都是最小的，最终结果也是最小的
		int num = 0;
		while(queue.size()!=1) {
			int x = queue.poll();
			int y = queue.poll();
			int sum = x+y;
			queue.add(sum);
			num = num + sum;//每一次把耗费的体力值加起来
		}
		System.out.println(num);
	}
}
