package array;

public class Demo12Search 
{
	public static void main(String[] args) 
	{
		int [] arr = {2,6,1,7,3,7,5};
		int target = Integer.parseInt(IO.readln("Enter the number you want to search : "));
		
		boolean isFound = false;
		for(int i = 0;i<arr.length;i++)
		{
			if(target == arr[i])
			{
				int index = i;
				IO.println(target+" found at "+index+"Index");
				isFound = true;
				break;
			}
		}
		if (!isFound)
		{
			IO.println("Element is not available in the array");
		}
	}
}
