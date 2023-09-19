package 2_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ÊýµÄÃÝ´Î {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(in.readLine());
        for(int i=0;i<t;i++) {
            String[] s = in.readLine().split(" ");
            long n = Long.parseLong(s[0]);
            long m = Long.parseLong(s[1]);
            long p = Long.parseLong(s[2]);
            out.println(num(n,m,p));
        }
        out.flush();
    }

    private static long num(long n, long m, long p) {//pow
        long result = 1;
        while (m > 0) {
            if ((m & 1 ) == 1) {//7  0~6  5*2 10%7=3*2%7=6  20%7=6
            	//123456789 % 10000 = 6789
            	//+789 % 10000 = 
                result = result * n % p;
                System.out.println(result%p);
            }
            m >>= 1;
            n = (n * n) % p;
        }
        return result;
    }
}