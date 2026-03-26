package array;
import java.util.Arrays;
//day 80
// second largest without duplicate 
public class Demo17seclar 
{
	public static void main(String[] args) 
	{
		int [] arr = {20,10,30,40,20,10,30,66};
		int temp =0;
		
		for(int  i =0 ;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] <arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		IO.println("Array is Ascending Order"+Arrays.toString(arr));
		IO.println("Second Largest element in Array is : "+arr[1]);		
	}
}
