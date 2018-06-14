package ProjectEuler;


public class p012 {
	public static int numOfDiv(long n) {
		int numOfDiv = 0;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) numOfDiv += 2;
		}
		if(Math.sqrt(n)*Math.sqrt(n) == n) numOfDiv--;
		
		return numOfDiv;
	}
	public static void main(String[] args) {
		int triNum = 1;
		int temp = 2;
		
		while(numOfDiv(triNum) <= 500) {
			triNum += temp;
			temp++;
		}
		System.out.println(triNum);
	}
}
