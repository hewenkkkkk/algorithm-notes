package 2_15;

import java.util.Scanner;

public class 分考场 {

    static int n, min = 100;
    static int arr[][];//用二维数组来记录考生是否认识，认识为设置为1
    static int examRoom[][];//用二维数组来记录考场数量
    static int examStuNum[];//记录每个考场中的人数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1][n + 1];
        examRoom = new int[n + 1][n + 1];
        examStuNum = new int[n + 1];
        int a, b;
        for (int i = 1; i <= m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;    // 3 1    1 3         1 3 
        }
        dfs(1, 0);
        System.out.println(min);
    }

    //深度优先搜索
    static void dfs(int stuNum, int examNum) {
        if (examNum >= min) return;//如果考场数大于最小考场数，跳过
        if (stuNum > n) {//如果所有学生安排完了,得出最小考场数量
            min = examNum < min ? examNum : min;
            return;
        }
        //遍历考场数
        for (int i = 1; i <= examNum; i++) {
            //遍历每个考场的考生人数
            int j;
            for (j = 1; j <= examStuNum[i]; j++) {//examStuNum表示这一个考场里的人数
                //如果当前考生与本考场中的某位考生认识，则打破循环
                if(arr[stuNum][examRoom[i][j]]==1){//我现在处理的是stuNum这个人，examRoom[i][j]表示i号考场里的第j
                    break;
                }
            }
            //如果当前考生与本考场的人都不认识
            if(j==examStuNum[i]+1){
                //将此考生加入本考场
                examRoom[i][++examStuNum[i]]=stuNum;
                //dfs继续下一轮搜索
                dfs(stuNum+1,examNum);
                //回溯
                --examStuNum[i];
            }
        }
        //如果此考生所有考场都有认识的，则开辟一个新的考场
        //将此考生加入本考场
        examRoom[examNum+1][++examStuNum[examNum+1]]=stuNum;
        //dfs继续下一轮搜索
        dfs(stuNum+1,examNum+1);
        //回溯
        --examStuNum[examNum+1];
    }

}