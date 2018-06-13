package ProjectEuler;

public class p007 {
	//6n-1 6n+1 test
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
			int counter = 1;
			long i = 1;
			
			while(counter != 10001) {
				i += 2;
				if(isPrime(i)) counter++;
				
			}
			
			System.out.println(i);
		}

	}