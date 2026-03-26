package array;
// day 81
// left rotate by one place
import java.util.Arrays;

public class Demo22_LeftRotate 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		IO.println("Original Array : "+Arrays.toString(arr));
		
		int temp = arr[0]; // temp = 1;
		
		for(int i =0;i<arr.length-1 ; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		IO.println("Array After left rotation : "+Arrays.toString(arr));
		
	}

}
