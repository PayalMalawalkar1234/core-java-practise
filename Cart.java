class Cart
	
{
private String itemName;
private double itemPrice;
private String itemBrand;

void cart()  //default constructor
{

}
Cart(String itemName,double itemPrice,String itemBrand)      //parameterised constructor
{
	System.out.println("-------constructor------");
this.itemName=itemName;
this.itemBrand=itemBrand;
this.itemPrice=itemPrice;

}

void display()           // method to dispay Cart details
{
	System.out.println("Name of Item:"+itemName);
	System.out.println("Name of The Brand:"+itemBrand);
	System.out.println("Price of Item:"+itemPrice);
	
}
 // main method
 public static void main(String...args)
 {
	 
	 Cart c1= new Cart("Mobile",20000,"Xiomi");
	 c1.display();                                          // calling method to display
	 
	 
 }

}
