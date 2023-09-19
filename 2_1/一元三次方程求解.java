package 直播2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 一元三次方程求解 {
	static double a;
	static double b;
	static double c;
	static double d;
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = in.readLine().split(" ");
        a = Double.parseDouble(s[0]);
        b = Double.parseDouble(s[1]);
        c = Double.parseDouble(s[2]);
        d = Double.parseDouble(s[3]);
        for(int i=-100;i<100;i++){//-99 ~ -100
            double left = i;
            double right = i+1;
            double y1 = f(left);
            double y2 = f(right);
            if(y1 == 0){
                System.out.printf("%.2f ", left);
            }
            if(y1*y2<0){//判断left~right之间有没有根
                for(int j=0;j<50;j++){
                    double mid =(left+right)/2;
                    //l=3,r=4,mid=3.5,不需要+1
                    if(f(mid)*f(right)<=0){//表示mid和right之间有零点(使f(x)==0的点)
                        left = mid;
                    }else{
                        right = mid;
                    }
                }
                System.out.printf("%.2f ", left);
            }
        }        
	}
	static double f(double x) {
		return a*x*x*x+b*x*x+c*x+d;
	}
}
