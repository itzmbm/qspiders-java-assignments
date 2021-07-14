class Laptop 
{
 void cost()
	{ 
	System.out.println("cost of laptop is 20000?");

}

}
class Desktop extends Laptop
{
void price()
	{ 
	System.out.println("Cost of Desktop is 15000?");

}
}
class Mainclass7
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Laptop l=new Desktop();
l.cost();
System.out.println("*****downcasting******");
Desktop d=(Desktop)l;
d.cost();
d.price();
	}
}
