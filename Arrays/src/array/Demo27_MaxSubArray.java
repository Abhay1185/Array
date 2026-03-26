package array;
//day 81
// find the maximum sub Array
public class Demo27_MaxSubArray 
{
	public static void main(String[] args) 
	{
		//int [] arr = {5,6,-3,7,-13,8,-2,5,-6,7,-11,3,10,-10,-6,-10,7,2};
		//int [] arr = {-1,3,4,-2};
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum =0;
		int maxSum =0;
		
		for(int i =0;i<arr.length;i++)
		{
			if(sum>=0)
			{
				sum+=arr[i];
			}
			else 
			{
				sum = arr[i];
			}
			if(sum>maxSum)
			{
				maxSum = sum;
			}
		}
		IO.println("Maximum sum of the Array : "+maxSum);
	}
}
