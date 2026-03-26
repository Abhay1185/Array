package array;

import java.util.Arrays;
//day 80
// second largest with duplicate
public class Demo19seclar 
{
	public static void main(String[] args) 
	{
		int [] arr = {12,90,56,77,34,77,90,90};
		
		Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted((a,b) -> b.compareTo(a))
				.skip(1)
				.findFirst()
				.ifPresent(IO::println);
	}

}
