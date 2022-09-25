class Cart1
{
private String itemName;
private double itemPrice;
private String itemBrand;

void Cart1()
{

}
Cart1(String itemName,double itemPrice,String itemBrand)
{
	System.out.println("-------constructor------");
this.itemName=itemName;
this.itemBrand=itemBrand;
this.itemPrice=itemPrice;

}
//getters and setters
String getItemName()
{
	return this.itemName;
}
void setItemName(String itemName)
{
	this.itemName=itemName;
}
String getItemBrand()
{
	return this.itemBrand;
}
void setItemBrand(String itemBrand)
{
	this.itemBrand=itemBrand;
}
double getItemPrice()
{
	return this.itemPrice;
}
void setItemPrice(double itemPrice)
{
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
	 
	 Cart1 c1= new Cart1("Mobile",20000,"Xiomi");
	 c1.display();
	 
	 
 }

}