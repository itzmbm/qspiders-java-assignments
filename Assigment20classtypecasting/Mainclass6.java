class Marker 
{
 void color()
	{ 
	System.out.println("red color........");

}

}
class Pen extends Marker
{
void price()
	{ 
	System.out.println("Price is ........");

}
}
class Mainclass6
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Marker m=new Pen();
m.color();
System.out.println("*****downcasting******");
Pen p=(Pen)m;
p.color();
p.price();
	}
}
