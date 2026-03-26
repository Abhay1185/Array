package array;
// day 81
//move alll zero at the end 
import java.util.Arrays;

public class Demo23_AllZeroaAtEnd {

	public static void main(String[] args) {
		int [] arr = {1,3,7,0,3,0,1,5,0,1};
		IO.println("Original Array : "+Arrays.toString(arr));
		
		int temp = 0;
		for(int i = 0;i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				for(int j =i+1;j<arr.length;j++)	// if j=0 then allzero comes in first
				{
					if(arr[j] != 0)
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		IO.println("After moving zero "+Arrays.toString(arr));
	}
}


