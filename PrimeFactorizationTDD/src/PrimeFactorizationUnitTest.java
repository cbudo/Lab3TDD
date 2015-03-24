import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorizationUnitTest {
	public ArrayList<Integer> List(Integer...integers)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : integers)
		{
			list.add(i);
		}
		return list;
	}
	@Test
	public void testOne() {
		assertArrayEquals(List().toArray(), PrimeFactorization.Factors().toArray());
	}
	@Test
	public void testTwo() throws Exception {
		assertArrayEquals(List(2).toArray(), PrimeFactorization.Factors(2).toArray());
	}

}
