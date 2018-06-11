package projectEuler;


public class q3 {
	public static void main(String[] args) {
        double largest = 0;
        double m = 600851475143d;
        for (int i = 3; i < m; i += 2) {
            while (m % i == 0) {
                largest = i;
                m = m / i;
            }
        }
        
        System.out.println("" + ((m == 1)?largest:m));
	 }
}
