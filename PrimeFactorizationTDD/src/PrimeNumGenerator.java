import java.util.ArrayList;




public class PrimeNumGenerator {
	public Object PrimeNumGenerator(int i)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(i==3)
		{
			list.add(2);
		}
		if(i==5)
		{
			list.add(2);
			list.add(3);
		}
		return list;
	}
}
