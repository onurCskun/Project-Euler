package ProjectEuler;

public class p002 {
	
	
	public static void main(String[] args) {
		int maxVal = 4000000;
		int n1 = 1, n2 = 2;
		int temp;
		int sumOfEvens = n2;
		do {
			temp = n2;
			n2 = temp + n1;
			n1 = temp;
			if(n2 % 2 == 0) sumOfEvens += n2;
		}while(n2 <= maxVal);
		
		System.out.println(sumOfEvens);
	}
}