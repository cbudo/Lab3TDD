import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> Factors() {
		return new ArrayList<Integer>();
	}

	public static ArrayList<Integer> Factors(int i) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (;i % 2 == 0;i/=2) {
			factors.add(2);
		}
		for (;i % 3 == 0;i/=3) {
			factors.add(3);
		}
		for (;i % 5 == 0;i/=5) {
			factors.add(5);
		}
		for (;i % 7 == 0;i/=7) {
			factors.add(7);
		}
		if (i > 1) {
			factors.add(i);
		}
		return factors;
	}

}
