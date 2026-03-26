package Basic;

public class ArrayEx1 {
	public static void main(String[] args)
	{
		byte byteArr[] = new byte[5];
		IO.println(byteArr.getClass().getName());
		
		short shortArr[] = new short[5];
		IO.println(shortArr.getClass().getName());
		
		int intArr[] = new int[5];
		IO.println(intArr.getClass().getName());
		IO.println(intArr.getClass().getSuperclass());
		IO.println(intArr.getClass().getClassLoader());
		
		
		
		long longArr[] = new long[5];
		IO.println(longArr.getClass().getName());
		
		
		float floatArr[] = new float[5];
		IO.println(floatArr.getClass().getName());
		
		
		double doubleArr[] = new double[5];
		IO.println(doubleArr.getClass().getName());
		
		
		char charArr[] = new char[5];
		IO.println(charArr.getClass().getName());
		
		
		boolean booleanArr[] = new boolean[5];
		IO.println(booleanArr.getClass().getName());
		
		
		String [] cities = {"hyd","bnglr","Pune"};
		IO.println(cities.getClass().getName());
		
	}

}
