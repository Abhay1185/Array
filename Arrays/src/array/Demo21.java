package array;
//day 81
// given an array of n integer, return true if the array is sorted in
//non-decreasing (Ascending ) order or else false ? 
public class Demo21 
{
	public static void main(String[] args) 
	{
		int [] arr = {2,5,1,5,3,8,9,10};
		
		IO.println(isSorted(arr));
	}
	public static boolean isSorted(int [] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr [i] > arr[i+1])
			{
				return false;
			}
		}
		return true;
	}

}
