package array;
// dAY 79
// initialization through loop & search based on ID
public class Demo7_2 
{
	public static void main(String[] args)
	{
	
		int size = Integer.parseInt(IO.readln("Enter the size of the array"));
		
		Product [] products  = new Product [size];
		
		// initializing the array 
		for(int i = 0; i<size;i++)
		{
			int id = Integer.parseInt(IO.readln("Enter the id no. :"));
			String name = IO.readln("Enter product name");
			double price = Double.parseDouble(IO.readln("Enter the price"));
	
			products [i] = new Product (id,name,price);
		}
		
		IO.println("Printing the product data : ");
		for(Product product : products)
		{
			IO.println(product);
		}
		
		int searchid = Integer.parseInt(IO.readln("Enter id you want to search"));
		boolean isFound = false;
		for (Product product :  products )
		{
			if(product.getId() == searchid)
			{
				IO.println(product);
				isFound = true;
				break;
			}
		}
		if (!isFound)

		{
			IO.println("Product with "+searchid+" id is not available");
		}
	}
}


class Product 
{
	private int id ;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}