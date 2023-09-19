package 直播3_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 蓝桥王国 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static long[] dis;
    static long[][] g;
    static int[] vis;
    public static void main(String[] args) throws IOException{
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        g = new long[n][n];
        dis = new long[n];
        vis = new int[n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i!=j) {
                    g[i][j] = Long.MAX_VALUE;
                    g[j][i] = Long.MAX_VALUE;
                }
            }
        }
        for(int i=0;i<m;i++) {
            s = in.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int w = Integer.parseInt(s[2]);
            g[x-1][y-1] = w;
        }
        for(int i=0;i<n;i++)
            dis[i] = g[0][i];//初始化距离数组，0为源点
        vis[0] = 1;//标记已经使用过了
        int minindex = 0;//记录当前从v0到哪一个点距离最小
        for(int i=0;i<n-1;i++){
            long min = Long.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(vis[j]==0 && dis[j]<min){
                    min = dis[j];//记录最小的距离
                    minindex = j;//记录最小的结点编号
                }
            }
            vis[minindex] = 1;
            for(int j=0;j<n;j++){//dis[minindex] = g[0][minindex]
                if(minindex!=j && g[minindex][j]<Long.MAX_VALUE && vis[j]!=0)
                    dis[j] = Math.min(dis[j],dis[minindex]+g[minindex][j]);
            }
        }
        for(int i=0;i<n;i++) {
            if(dis[i]!=Long.MAX_VALUE)
                System.out.print(dis[i]+" ");
            else
                System.out.print(-1+" ");
        }
    }
}