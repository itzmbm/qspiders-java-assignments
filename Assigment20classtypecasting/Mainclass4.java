class Pool 
{
 int y=20;
 void cool()
	{ 
	System.out.println("run cool........");

}

}
class Shoes extends Pool
{
void Price()
	{ 
	System.out.println("Price is 200........");

}
}
class Mainclass4
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Pool p=new Shoes();
p.cool();
System.out.println(p.y);
System.out.println("*****downcasting******");
Shoes s=(Shoes)p;
s.cool();
System.out.println(s.y);
s.Price();
	}
}
