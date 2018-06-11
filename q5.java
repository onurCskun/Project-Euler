package projectEuler;

public class q5 {
	
	public static long gcd(long n1, long lcm) {
		return lcm == 0 ? n1 : gcd(lcm,n1%lcm);
	}
	
	public static void main(String[] args) {
		
		long lcm = 1;
		for(int i = 1; i <= 20; i++) {
			lcm = (i*lcm)/gcd(i,lcm);
		}
		
		System.out.println(lcm);
	}

}
