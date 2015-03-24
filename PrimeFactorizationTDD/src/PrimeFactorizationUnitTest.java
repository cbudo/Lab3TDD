import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorizationUnitTest {

	@Test
	public void testOne() {
		assertArrayEquals(new ArrayList<Integer>().toArray(), PrimeFactorization.Factors().toArray());
	}

}
