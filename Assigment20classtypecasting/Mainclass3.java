class Cool1 
{
 void test()
	{ 
	System.out.println("run test........");

}

}
class Watch extends Cool1
{
void chain()
	{ 
	System.out.println("run chain........");

}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Cool1 c1=new Watch();
c1.test();
System.out.println("*****downcasting******");
Watch w1=(Watch)c1;
w1.test();
w1.chain();
	}
}
