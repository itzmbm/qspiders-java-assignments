class Car 
{
 void price()
	{ 
	System.out.println("cost of car is 15000");

}

}
class Bike extends Car
{
int y=20;
}
class Mainclass8
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Car c=new Bike();
c.price();
System.out.println("*****downcasting******");
Bike b=(Bike)c;
System.out.println(b.y);
b.price();
	}
}
