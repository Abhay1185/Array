package array;

import java.util.Arrays;

//day 80
//second largest with duplicate
public class Demo18SecLar 
{
	public static void main(String[] args) 
	{
		int [] arr = {12,90,56,77,34,77,90,90};
		int temp = 0;
		
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;					
				}
			}
		}
		IO.println("Arrays in Ascending Order :"+Arrays.toString(arr));
	
		int largest = arr[arr.length-1];
		int second = 1;
		
		for(int i = arr.length-2;i>=0;i--) 
		{	
			if(arr[i] != largest )
			{
				second = arr[i];
				break;
			}
		}
		IO.println("Second Largest is : "+second);
	}
}




