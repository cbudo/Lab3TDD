import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class PrimeFactorization {

	public static ArrayList<Integer> Factors() {
		return new ArrayList<Integer>();
	}

	public static ArrayList<Integer> Factors(int i) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		if (i % 2 == 0) {
			factors.add(2);
			i /= 2;
		}
		if (i > 1) {
			factors.add(i);
		}
		return factors;
	}

}
