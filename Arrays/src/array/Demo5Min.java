package array;

import java.util.Arrays;

public class Demo5Min 
{
	public static void main(String[] args) 
	{
		int [] values = {10,20,30,40,50,60};
		IO.println("Original Array is "+Arrays.toString(values));
	
		int minElement = FindMinimum.getMinimumElement(values);
		IO.println("Minimum Element is : "+minElement);		
	}
}
class FindMinimum 
{
	public static int getMinimumElement(int [] arr)
	{
		int min = arr[0];
		
		for(int element : arr)
		{
			if (element < min )
			{
				min = element;
			}
		}
		return min;
	}
}
