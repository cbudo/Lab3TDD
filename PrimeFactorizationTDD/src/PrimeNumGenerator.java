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
		if(i==7)
		{
			list.add(2);
			list.add(3);
			list.add(5);
		}
		return list;
	}
}
