package array;

import java.util.Arrays;

// day 80
//Inert new element in the array in middle position 
public class Demo14 
{
	public static void main(String[] args) 
	{
		int [] values = {10,20,30,40,50};
		int ele = 100;

		IO.println("Original values : "+Arrays.toString(values));
	
		int [] insertAtmiddle = ModdleAtLast.insertAtmiddle(values, ele); 
	
		IO.println("Aray element after insertion : "+Arrays.toString(insertAtmiddle));
	
	}
}

class ModdleAtLast
{
	public static int[] insertAtmiddle(int [] arr , int element)
	{
		int [] newArray = new int [arr.length + 1];
		int middle = arr.length /2;
		
		// copy old array data upto middle
		for(int i =0;i<middle;i++)
		{
			newArray[i] = arr[i];
		}
		
		// insert the element in the middle
		newArray[middle] = element;
		for(int i =middle; i <arr.length;i++)
		{
			newArray[i+1] = arr[i];
		}
		return newArray;
	}
}

