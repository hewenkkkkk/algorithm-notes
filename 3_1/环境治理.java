package 3_1;
import java.io.*;

public class 环境治理 {
    static int N=110;
    static long[][] g=new long[N][N],m=new long[N][N],f=new long[N][N];
    static long n,q;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter  out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String[] s=br.readLine().split(" ");
        n=Long.parseLong(s[0]);
        q=Long.parseLong(s[1]);
        for(int i=1;i<=n;++i){
            s=br.readLine().split(" ");
            for(int j=1;j<=n;++j){
                g[i][j]=Long.parseLong(s[j-1]);
            }
        }
        for(int i=1;i<=n;++i){
            s=br.readLine().split(" ");
            for(int j=1;j<=n;++j){
                m[i][j]=Long.parseLong(s[j-1]);
                f[i][j]=m[i][j];
            }
        }
        if(floyd()>q){
            out.println(-1);
            out.flush();
            return;
        }
        long l=0,r=1000000000;
        while(l<r){
            long mid=l+r>>1;
            if(check(mid)) r=mid;
            else l=mid+1;
        }
        out.println(r);
        out.flush();
    }
    static long floyd(){
        long a=0;
        for (int k = 1; k <= n; k ++ )
            for (int i = 1; i <= n; i ++ )
                for (int j = 1; j <= n; j ++ )
                    f[i][j] =Math.min(f[i][j], f[i][k] + f[k][j]);

        for(int i=1;i<=n;++i)
            for(int j=1;j<=n;++j)
                a+=f[i][j];
        return a;
    }
    static boolean check(long x){
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n;++j) f[i][j]=g[i][j];
        }
        long h=x/n;
        long s=x%n;
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n;++j){
                if(i==j) continue;
                if(i<=s) f[i][j]=Math.max(m[i][j],f[i][j]-h-1);
                else f[i][j]=Math.max(m[i][j],f[i][j]-h);
                f[j][i]=f[i][j];
            }
        }
        return floyd()<=q;
    }
}
