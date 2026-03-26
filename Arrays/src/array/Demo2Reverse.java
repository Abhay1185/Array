package array;
// reverse  an array 
//day 78
public class Demo2Reverse {
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(IO.readln("Enter the size of the array"));

		int [] arr = new int [size];
		for(int i =0;i<arr.length;i++)
		{
			IO.println("Enter the element of the array at "+i+"Index : ");
			arr[i] = Integer.parseInt(IO.readln());
		}
		for(int element : arr)
		{
			IO.print(element+"\t");
		}
		
		IO.println();
		IO.println("Array in reverse order : ");
		for(int i = arr.length-1;i>=0;i--)
		{
			IO.print(arr[i]+"\t");
		}
	}

}
