package array;
//day 78
/*
   different way to create 1D array and fetching the element using ordinary 
   for loop / for each loop and to String ()

*/

import java.util.Arrays;
public class Demo1 
{
	public static void main(String[] args) 
	{
		IO.println("First approach");	
		int size = Integer.parseInt(IO.readln("enter the size of the array"));
		int [] arr1 = new int [size];
		
		// initializing the array elemnt 
		for(int i = 0;i<size;i++)
		{
			IO.print("Enter the element of the array at "+i+" index : ");
			arr1[i] = Integer.parseInt(IO.readln());
		}
		IO.println("printing the elemnt");
		for(int i = 0; i<size;i++)
		{
			IO.print(arr1[i]+"	");
		}
		
		IO.println();
		
		
		IO.println("Second approach");
		int [] arr2 = new int[] {100,200,300,400};
		for(int element : arr2)
		{
			IO.print(element + "\t");
		}
		
		IO.println();
		IO.println("Third approach");
		int [] arr3 = {100,200,300};
		IO.println(Arrays.toString(arr3));
	}

}
