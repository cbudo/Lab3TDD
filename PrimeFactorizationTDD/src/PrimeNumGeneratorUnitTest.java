import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumGeneratorUnitTest {
	private int inputNum;
	private List<Integer> expectedResult;
	private PrimeNumGenerator png;
	@Before
	public void initialize()
	{
		png = new PrimeNumGenerator();
	}
	public PrimeNumGeneratorUnitTest(int inputNum,List<Integer> expectedResult)
	{
		this.inputNum = inputNum;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection primeCheck()
	{
		return (Collection) Arrays.asList( new Object[][]{
				{2,list()},
				{3,list(2)},
				{5,list(2,3)},
				{7,list(2,3,5)},
				{13,list(2,3,5,7,11)}
		});
	}
	private static List<Integer> list(Integer...integers){
		return (List<Integer>) Arrays.asList(integers);
	}
	@Test
	public void test() {
		assertEquals(expectedResult, png.PrimeNumGenerator(inputNum));
	}

}
