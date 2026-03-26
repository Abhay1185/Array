package array;

import java.util.Arrays;

//Day 80
// merge two array in the single array
public class Demo15 
{
	public static void main(String[] args) 
	{
		int [] x = {10,20,30,40};
		int [] y = {50,60,70,80};
	
		int [] MergeTwoArray = MergeArray.MergeTwoArray(x, y);
		IO.println("Array afte joining : "+Arrays.toString(MergeTwoArray));
	}
}
class MergeArray 
{
	public static int [] MergeTwoArray(int []p,int[]q)
	{
		int [] newArray = new int [p.length + q.length];
		int position  = 0;
		
		for(int element : p)
		{
			newArray[position] = element;
			position ++;
		}
		
		for(int element : q)
		{
			newArray[position] = element;
			position ++;
		}
		return newArray;
	}
}
