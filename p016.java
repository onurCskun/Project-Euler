package ProjectEuler;

import java.math.BigInteger;

public class p016 {
	public static BigInteger pow(int x, int y) {
		if(y == 1) return BigInteger.valueOf(x);
		return BigInteger.valueOf(x).multiply(pow(x,y-1));
	}
	
	public static BigInteger sod(BigInteger n) {
		if(n.divide(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(1)) < 1) return n.mod(BigInteger.valueOf(10));
		return n.mod(BigInteger.valueOf(10)).add(sod(n.divide(BigInteger.valueOf(10))));
	}
	
	public static void main(String[] args) {
		int x = 2, y = 1000;
		BigInteger xPowY = pow(x,y);
		BigInteger sumOfDig = sod(xPowY);
		System.out.println(sumOfDig);
	}
}
