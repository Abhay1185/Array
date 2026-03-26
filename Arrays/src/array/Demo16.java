package array;
// day 80
// unique element in the array 
public class Demo16 
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,30,20};
		for(int i =0;i<arr.length;i++)
		{
			boolean isUnique = true;
			for(int j = 1;j<arr.length;j++)
			{
				if(arr[i] == arr[j] && i!=j)
				{
					isUnique = false;
					break;
				}
			}
			if(isUnique)
			{
				IO.println("Unique Elements are "+arr[i]);
			}
		}
	}
}