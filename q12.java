package projectEuler;

public class q12 {
	
	public static int numOfDiv(long n) {
		int numOfDivs = 0;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) numOfDivs += 2;
		}
		if(Math.pow(Math.sqrt(n),2) == n) numOfDivs--;
		
		return numOfDivs;
	}
	
	public static void main(String[] args) {
		boolean bool = true;
		int triNum = 1;
		int temp = 2;
		while(bool) {
			triNum += temp;
			temp++;
			bool = (numOfDiv(triNum) > 500) ? false : true;
			
		}
		
		System.out.println(triNum);
	}
}
