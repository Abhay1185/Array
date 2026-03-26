package array;
// Day 79
public class Demo11Dusplicate 
{
	public static void main(String[] args) 
	{
		int [] arr = {2,4,5,5,2,6,3};
		for (int i = 0; i<arr.length;i++)
		{
			for(int j = i+1 ;j<arr.length;j++)
			{
				if(arr[i] == arr[j] )
				{
					IO.println("duplicate element in array is : "+arr[i]);
				}
			}
		}
	}
}
