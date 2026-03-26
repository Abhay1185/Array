package array;
/*
  WAP TO WORK WITH REFERENCE ARRAY 
  A) MANUAL INSERTION
 */
public class Demo7 
{
	public static void main(String[] args) 
	{
		Customer [] customers = new Customer[5];
		customers[0]  = new Customer(1,"A",12000);
		customers[1]  = new Customer(2,"B",13000);
		customers[2]  = new Customer(3,"C",14000);
		customers[3]  = new Customer(4,"D",15000);
		customers[4]  = new Customer(5,"E",16000);
		
		
		for(Customer cust  :  customers)
		{
			IO.println(cust);
		}
	}
}

class Customer
{
	private int id ;
	private String name;
	private double bill;
	public Customer(int id, String name, double bill) 
	{
		super();
		this.id = id;
		this.name = name;
		this.bill = bill;
	}
	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
}
