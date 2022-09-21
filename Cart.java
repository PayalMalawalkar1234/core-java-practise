class Cart
{
private String itemName;
private double itemPrice;
private String itemBrand;

void cart()
{

}
Cart(String itemName,double itemPrice,String itemBrand)
{
	System.out.println("-------constructor------");
this.itemName=itemName;
this.itemBrand=itemBrand;
this.itemPrice=itemPrice;

}

void display()
{
	System.out.println("Name of Item:"+itemName);
	System.out.println("Name of The Brand:"+itemBrand);
	System.out.println("Price of Item:"+itemPrice);
	
}
 
 public static void main(String...args)
 {
	 
	 Cart c1= new Cart("Mobile",20000,"Xiomi");
	 c1.display();
	 
	 
 }

}