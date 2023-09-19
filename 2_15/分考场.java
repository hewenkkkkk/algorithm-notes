package 2_15;

import java.util.Scanner;

public class �ֿ��� {

    static int n, min = 100;
    static int arr[][];//�ö�ά��������¼�����Ƿ���ʶ����ʶΪ����Ϊ1
    static int examRoom[][];//�ö�ά��������¼��������
    static int examStuNum[];//��¼ÿ�������е�����
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

    //�����������
    static void dfs(int stuNum, int examNum) {
        if (examNum >= min) return;//���������������С������������
        if (stuNum > n) {//�������ѧ����������,�ó���С��������
            min = examNum < min ? examNum : min;
            return;
        }
        //����������
        for (int i = 1; i <= examNum; i++) {
            //����ÿ�������Ŀ�������
            int j;
            for (j = 1; j <= examStuNum[i]; j++) {//examStuNum��ʾ��һ�������������
                //�����ǰ�����뱾�����е�ĳλ������ʶ�������ѭ��
                if(arr[stuNum][examRoom[i][j]]==1){//�����ڴ������stuNum����ˣ�examRoom[i][j]��ʾi�ſ�����ĵ�j
                    break;
                }
            }
            //�����ǰ�����뱾�������˶�����ʶ
            if(j==examStuNum[i]+1){
                //���˿������뱾����
                examRoom[i][++examStuNum[i]]=stuNum;
                //dfs������һ������
                dfs(stuNum+1,examNum);
                //����
                --examStuNum[i];
            }
        }
        //����˿������п���������ʶ�ģ��򿪱�һ���µĿ���
        //���˿������뱾����
        examRoom[examNum+1][++examStuNum[examNum+1]]=stuNum;
        //dfs������һ������
        dfs(stuNum+1,examNum+1);
        //����
        --examStuNum[examNum+1];
    }

}