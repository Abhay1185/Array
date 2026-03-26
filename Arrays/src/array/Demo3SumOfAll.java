package array;

import java.util.Arrays;

//day78
/*
 Sum of all the element in the array  
 */
public class Demo3SumOfAll 
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50};
		int sum =0;
		for(int element : arr)
		{
			sum =  sum + element;
		}
		IO.println(sum);
		IO.println();
		IO.println();
		IO.println();
		IO.println("JAVA 8 Approach");
		sum = Arrays
				.stream(arr)
				.sum();
		IO.println("Sum of array element are :"+sum );
	}

}


/*
  	int [] arr = {1,2,3,4,5};
		
	int sum = 0;
		
	for(int i = 0;i<arr.length;i++)
	{
		sum = sum+ arr[i];
		
	}
	IO.println(sum);
		
*/
