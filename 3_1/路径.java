package Ö±²¥3_1;

public class Â·¾¶ {

	public static void main(String[] args) {
		long[][] g = new long[2022][2022];
		for(int i=1;i<2021;i++) {
			for(int j=i+1;j<=2021;j++) {
				if(Math.abs(i-j)<=21) {
					int value = lcd(i, j);
					g[i][j] = value;
					g[j][i] = value;
				}else {
					g[i][j] = Long.MAX_VALUE;
					g[j][i] = Long.MAX_VALUE;
				}
			}
		}
		for(int k=1;k<=2021;k++) {
			for(int i=1;i<=2021;i++) {
				for(int j=1;j<=2021;j++) {
					if(i!=j && i!=k && j!=k && g[i][k]+g[k][j]<g[i][j] && g[i][k]!=Long.MAX_VALUE && g[k][j]!=Long.MAX_VALUE)
						g[i][j] = g[i][k]+g[k][j];
				}
			}
		}
		System.out.println(g[1][2021]);
	}
	static int gcd(int a,int b) {
		return b==0?a:gcd(b, a%b);
	}
	static int lcd(int a,int b) {
		return a*b/gcd(a, b);
	}
}
