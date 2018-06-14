package ProjectEuler;

public class p014 {
	public static int seq(long n) {
		if(n == 1) return 0;
		else if(n % 2 == 0) return 1 + seq(n/2);
		else return 1 + seq((3*n)+1);

	}
	public static void main(String[] args) {
		int max = 0;
		int index = 0;
		for(int i = 1; i < 1000000; i++) {
			if(seq(i) > max) {
				max = seq(i);
				index = i;
			}
		} 
		
		System.out.println(index);
	}

}
