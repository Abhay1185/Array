package array;
//Heap & stack diagram [static member + array]
public class Demo8Heap_Stack 
{
	public static void main(String[] args) 
	{
		Alpha am1 = new Alpha(9);
		Alpha am2 = new Alpha(2);

		Alpha [] ar = fill (am1,am2);
		
		ar[0] = am2;
		IO.println(ar[0].val);
		IO.println(ar[1].val);
	}
	
	public static Alpha [] fill(Alpha a1, Alpha a2)
	{
		a1.val = 15;
		Alpha fa[] = new Alpha[] 
		{
			a2,a1
		};
		return fa;
	}
}

class Alpha 
{
	int val;
	static int sval = 200;
	static Demo8Heap_Stack b = new Demo8Heap_Stack();
	
	public Alpha (int val)
	{
		this.val = val;
	}
}