package ProjectEuler;

public class p009 {
	public static void main(String[] args) {
		long product;
		int a = 1, b = 1, c = 0;
		boolean bool = true;
		
		while(bool) {
			c = 1000 - (a+b);
			if(a > c || b > c) {
				a++;
				b = 1;
			}
			else if(c*c == (a*a + b*b)) bool = false;
			else if(b == 999 - a) {
				a++;
				b = 1;
			}
			else b++;
		}
		product = a*b*c;
		System.out.println(product);
	}

}
/*
for(a = 1; a < 999; a++) {
	for(b = 1; b < 999-a; b++) {
		c = 1000 - (a+b);
		if((a*a + b*b) == c*c) {
			product = a*b*c;
			break;
		}
	}
}
*/