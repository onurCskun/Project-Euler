package projectEuler;

public class q6 {
	public static void main(String[] args) {
		long sum1 = 0, sum2 = 0;
		int num = 100;
		
		for(int i = 1; i <= num; i++) {
			sum1 += (long)Math.pow(i, 2);
			sum2 += i;
		}
		sum2 = (long)Math.pow(sum2, 2);
		
		System.out.println(sum2 - sum1);
	}
}
