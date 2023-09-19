package 直播2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class k倍区间 {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        long[] sum = new long[n+1];
        long res = 0;
        int[] cnt = new int[k];//每一个余数出现的次数
        cnt[0] = 1;
        for(int i = 1; i <= n; i ++ ){
            sum[i] = sum[i-1] + Integer.parseInt(in.readLine());
            res += cnt[(int) (sum[i] % k)];
            System.out.println(Arrays.toString(cnt));
            cnt[(int) (sum[i] % k)]++ ;
        }
        System.out.println(res);
	}
/**5 2
	1
	2
	3
	4
	5
	
	1    2      3      4      5
	1    3      6      10     15
	1    1      0      0      1
	0    1      2      4      6
	
*/
	
	
	
}
