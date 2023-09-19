package Ö±²¥1_11;

import java.math.BigInteger;

public class ÆåÅÌ·ÅÂó×Ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = BigInteger.ONE;
		BigInteger a = BigInteger.valueOf(1L);
		//BigInteger b = new BigInteger("12");
		for(int i=0;i<63;i++) {
			a = a.multiply(BigInteger.valueOf(2L));
			sum = sum.add(a);
		}
		System.out.println(sum);
		
		
		//2.
		//111  1*2^2+1*2^1+1*2^0
		StringBuffer s = new StringBuffer("");
		for(int i=0;i<64;i++) {
			s = s.append("1");
		}
		System.out.println(new BigInteger(s.toString(),2));
	}

}
