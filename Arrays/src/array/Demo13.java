package array;

import java.util.Arrays;

// day 80
// insert a element in the array in the last position 
public class Demo13 
{
	public static void main(String[] args) 
	{
		int [] values = {10,20,30,40,50,60};
		int ele = Integer.parseInt(IO.readln("Enter the element you want to insert at last : "));
				
		IO.println("Original Array is : "+Arrays.toString(values));
		int [] insertAtLast = InsertArrayAtLast.insertAtLast(values, ele);
		IO.println(Arrays.toString(insertAtLast));
	}
}
class InsertArrayAtLast 
{
	public static int[] insertAtLast (int [] arr,int element)
	{
		int [] newArray = new int [arr.length+1];
		for(int i =0;i<arr.length;i++)
		{
			newArray[i] = arr[i];
		}
		newArray [newArray.length -1]= element ;
		return newArray;
	}
}

