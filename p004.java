package ProjectEuler;

public class p004 {
	public static boolean isPal(long n) {
		int length = (int)(Math.log10(n)+1);
		long temp = 0;
		
		for (long i = length/2; i > 0; i--) {
			temp += (n % 10)*Math.pow(10, i-1);
			n /= 10;
		}
		
		if(n == temp) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		long max = 0;
		for(int i = 100; i <= 999; i++) {
			for(int k = 100; k <= 999; k++) {
				if(isPal(i*k)) {
					if(i*k > max) max = i*k;
				}
			}
		}
		
		System.out.println(max);
	}

}