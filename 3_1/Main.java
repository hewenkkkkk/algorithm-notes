package 3_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num(15));
	}
	public static int num(long n){
	    int ans = 0;
	    for(int i=2;i<n/i;i++){
	        while(n%i==0){
	            ans++;
	            n/=i;
	        }
	    }
	    if(n>1)
	        ans++;
	    return ans;
	}
}
