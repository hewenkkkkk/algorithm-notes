package 直播2_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 小明的彩灯 {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        long[] num = new long[n];
        s = in.readLine().split(" ");
        for(int i=0;i<n;i++){
            num[i] = Long.parseLong(s[i]);
        }
        for(int i=0;i<q;i++){
            s = in.readLine().split(" ");
            int l = Integer.parseInt(s[0]);
            int r = Integer.parseInt(s[1]);
            long x = Long.parseLong(s[2]);
            for(int j=l-1;j<=r-1;j++){
                num[j] = num[j] + x;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(Math.max(0,num[i])+" ");
        }
        out.flush();
    }
}