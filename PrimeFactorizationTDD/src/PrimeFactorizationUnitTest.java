import static org.junit.Assert.*;

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
	@Test
	public void testThree() throws Exception {
		assertArrayEquals(List(3).toArray(),PrimeFactorization.Factors(3).toArray());
	}
	@Test
	public void testFour() throws Exception {
		assertArrayEquals(List(2,2).toArray(),PrimeFactorization.Factors(4).toArray());
	}
	@Test
	public void testFive() throws Exception {
		assertArrayEquals(List(2,3).toArray(), PrimeFactorization.Factors(6).toArray());
	}
	@Test
	public void testSix() throws Exception {
		assertArrayEquals(List(2,2,2).toArray(), PrimeFactorization.Factors(8).toArray());
	}
	@Test
	public void testSeven() throws Exception {
		assertArrayEquals(List(3,3).toArray(), PrimeFactorization.Factors(9).toArray());
	}
}
