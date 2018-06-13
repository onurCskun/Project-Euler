package projectEuler;

public class q10 {
	public static boolean isPrime(long n) {
	    if (n <= 1)  return false;
	    if (n <= 3)  return true;

	    if (n%2 == 0 || n%3 == 0) return false;

	    for (int i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;
	    
	return true;
}
	
	public static void main(String[] args) {
		int num = 2000000; //2.000.000
		long sum = 2;
		
		for(int i = 3; i < num; i+=2) {
			if(isPrime(i)) sum += i;
		}
		
		System.out.println(sum);
	}
}
