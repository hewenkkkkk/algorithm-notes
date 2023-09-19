package 直播3_1;

import java.util.Scanner;

public class 出差 {
    static int H=99999;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int N=scan.nextInt();
        int M=scan.nextInt();
        int[] a=new int[N];
        int[][] b=new int[N][N];
        for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(i==j) continue;
                    b[i][j]=H;
               }
            }
        for(int i=0;i<N;i++){
          a[i]=scan.nextInt();
        }
        for(int i=0;i<M;i++){
          int c=scan.nextInt();
          int d=scan.nextInt();
          b[d-1][c-1]=b[c-1][d-1]=scan.nextInt();
        }
        int[] e=dijkstra(a,b,0);
        System.out.println(e[a.length-1]);
        scan.close();
    }
    public static int[] dijkstra(int[] a,int[][] b,int start){
      boolean[] c=new boolean[a.length];
      int[] d=new int[a.length];
      a[a.length-1]=0;
      c[start]=true;
      for(int i=0;i<a.length-1;i++){
        int k=-1;
        int dmin=99999;
        for(int j=0;j<a.length;j++){
          if(c[j]==false && b[start][j]+a[j]<dmin){
            dmin=b[start][j]+a[j];
            k=j;
          }
        }
        d[k]=dmin;
        c[k]=true;
        for(int z=0;z<a.length;z++){
          if(c[z]==false && d[k]+b[k][z]<b[start][z]){
            b[start][z]=d[k]+b[k][z];
          }
        }
      }
      return d;
    }
}