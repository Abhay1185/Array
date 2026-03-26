package array;

import java.util.Arrays;

// modify the value of an array [change array element]
public class Demo9ModifyArray 
{
	public static void main(String[] args) 
	{
		int [] values = {10,20,30,40,50};

		IO.println("Original aray is :"+Arrays.toString(values));
		
		int [] modifyArrayElement = modifyArrayElement(values);
		
		IO.println("Array element After modification "+Arrays.toString(modifyArrayElement));
		IO.println("Original Array After modification "+Arrays.toString(values));
	}
	
	public static int [] modifyArrayElement(int [] arr)
	{
		arr[0] = 100;
		arr[1] = 200;
		return arr;
	}
}
