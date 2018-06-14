package ProjectEuler;

public class p017 {
	public static int num(int n) {
		switch(n) {
			case 1 : return 3;
			case 2 : return 3;
			case 3 : return 5;
			case 4 : return 4;
			case 5 : return 4;
			case 6 : return 3;
			case 7 : return 5;
			case 8 : return 5;
			case 9 : return 4;
			default : return 0;
			}
	
	}
	
	public static int fDig(int n) {
		return num(n);
	}
	
	public static int sDig(int n) {
		switch(n) {
			case 10 : return 3;
			case 11 : return 6;
			case 12 : return 6;
			case 13 : return 8;
			case 14 : return 8;
			case 15 : return 7;
			case 16 : return 7;
			case 17 : return 9;
			case 18 : return 8;
			case 19 : return 8;
			case 2 : return 6;
			case 3 : return 6;
			case 4 : return 5;
			case 5 : return 5;
			case 8 : return 6;
			default : return 2 + fDig(n);
		}
	}
	
	public static int tDig(int n) {
		return num(n) + 7;
	}
	
	public static int sumDig(int n) {
		int length;
		if(n == 0) return fDig(n);
		else length = (int)(Math.log10(n)+1);
		
		if(length == 3) {
			if(n%100 != 0) return 3 + sumDig(n%100) + tDig(n/100);
			return sumDig(n%100) + tDig(n/100);
		}else if(length == 2) {
			if(n < 20) return sDig(n);
			else return sumDig(n%10) + sDig(n/10);
		} 
		
		return fDig(n);
	}
	
	public static void main(String[] args) {
		int onethousand = 11;
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += sumDig(i);
			if(i == 1000) sum += onethousand;
		}
		
		System.out.println(sum);
	}
}