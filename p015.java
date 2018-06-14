package ProjectEuler;

import java.math.BigInteger;

public class p015 {
	public static BigInteger fac(int n) {
		if(n <= 1) return BigInteger.valueOf(1);
		return fac(n-1).multiply(BigInteger.valueOf(n));
	}
	
	public static void main(String[] args) {
		int x = 20, y = 20;
		BigInteger numOfRoutes;
		
		numOfRoutes = fac(x+y).divide(fac(x).multiply(fac(y)));
		
		System.out.println(numOfRoutes);
	}
}
