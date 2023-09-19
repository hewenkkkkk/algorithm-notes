package 直播2_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 最大间隙 {
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        long[] num = new long[n];
        String[] s = in.readLine().split(" ");
        long max = 0;
        for(int i=0;i<n;i++){
            num[i] = Long.parseLong(s[i]);
            if(i!=0){
              max = Math.max(num[i]-num[i-1],max);
            }
        }
        System.out.println(max);
    }
}