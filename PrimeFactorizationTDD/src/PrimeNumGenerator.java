import java.util.ArrayList;

public class PrimeNumGenerator {
	public Object PrimeNumGenerator(int i)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int j = 0; j<i;j++)
		{
			if(checkPrimes(j))
			{
				list.add(j);
			}
		}
		return list;
	}
	public boolean checkPrimes(int n)
	{
		if (n <= 3) {
	        return n > 1;
	    } else if (n % 2 == 0 || n % 3 == 0) {
	        return false;
	    } else {
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
	
}
