package array;
// wap to calculate the marks nd find the avg
public class Demo4AVG {

	public static void main(String[] args) {
	
		int [] arr = {60,80,90,80,60};
		int sum = 0;
		for(int element : arr)
		{
			sum +=element ; 
			IO.print(element+"\t");
		}
		IO.println();
		IO.println("Sum of all the subject is "+sum);
		int avg = sum /arr.length;
		IO.println("Average is : "+avg);
		
	}

}
