package array;
// day 81
// find the sub Array from the original Array
public class Day26_FindSubArray 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		
		for(int i =0;i<arr.length;i++)
		{
			for(int  j= i;j<arr.length;j++)
			{
				for(int k =i;k<=j;k++)
				{
					IO.print(arr[k]+" ");
				}
				IO.println();
			}
		}
	}
}
