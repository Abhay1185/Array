package array;
// day 81
public class Demo20TwoSum 
{
	public static void main(String[] args) 
	{
		int [] values = {2,3,6,2,8,0};
		int target = 14;
		
		for(int i =0;i<values.length;i++)
		{
			for(int j = i+1;j<values.length;j++)
			{
				if(values[i] + values[j] == target)
				{
					IO.println(target+" found at "+i+"nd  and "+j+ "th  index position ");
				}
			}
		}			
	}
}
