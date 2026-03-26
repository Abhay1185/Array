package array;

import java.util.Arrays;

// DAy 79
//Ascending order
public class Demo10Ascending 
{
	public static void main(String[] args) 
	{
		int [] arr = {3,51,3,7,1,9};
		
		IO.println("Original Array : "+Arrays.toString(arr));

		int temp =0;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		IO.println("Array element in ascending order : "+Arrays.toString(arr));
	}
}
