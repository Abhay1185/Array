package array;
// max Element
import java.util.Arrays;
public class Demo6_Max {
	
	public static void main(String[] args) 
	{
	
		int [] arr = {10,20,30,40,50};
		IO.println(Arrays.toString(arr));

		int max = FindMax.getMaxElement(arr);
		IO.println("Maximum elemnt is "+max);
	}
}

class FindMax
{
	public static int getMaxElement(int [] arr)
	{
		int max = 0 ;
		
		for(int element : arr)
		{
			if(element > max)
			{
				max = element;
			}
		}
		return max;
	}
}
		
