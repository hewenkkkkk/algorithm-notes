package 直播2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 全球变暖dfs {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        char[][] x = new char[n][n];
        char[][] s = new char[n][n];
        for(int i=0;i<n;i++){
            String a = in.readLine();
            x[i] = a.toCharArray();
            s[i] = a.toCharArray();
        }
        int res1 = num(x,n);//求淹没前的岛屿数量
        f(s,n);//淹没
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(s[i][j]);
        	}
        	System.out.println();
        }
        int res2 = num(s,n);//求淹没后的岛屿数量
        out.println(res1-res2);
        out.flush();
    }

    private static int num(char[][] s,int n) {
        int sum = 0;//岛屿的数量
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s[i][j]=='#'){
                    sum++;
                    dfs(s,i,j,n);
                }
            }
        }
        return sum;
    }

    private static void f(char[][] s,int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s[i][j]=='#'){
                    if(i==0 && s[i+1][j]=='.'){
                        s[i][j]=',';
                    }else if(i==n-1 && s[i-1][j]=='.'){
                        s[i][j]=',';
                    }else if(j==0 && s[i][j+1]=='.'){
                        s[i][j]=',';
                    }else if(j==n-1 && s[i][j-1]=='.'){
                        s[i][j]=',';
                    }else if(s[i+1][j]=='.' || s[i][j+1]=='.' || s[i-1][j]=='.' || s[i][j-1]=='.'){
                        s[i][j]=',';
                    }
                }
            }
        }
    }

    private static void dfs(char[][] s,int i,int j,int n) {
        if(i<0 || j<0 || i>=n || j>=n) {//这个点必须是在地图范围内
            return;
        }
        if(s[i][j]=='.')//是否是陆地
            return;
        s[i][j]='.';//把陆地淹没
        dfs(s,i+1,j,n);
        dfs(s,i-1,j,n);
        dfs(s,i,j+1,n);
        dfs(s,i,j-1,n);
    }
}