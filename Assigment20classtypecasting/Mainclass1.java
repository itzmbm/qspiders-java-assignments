class Sample1 
{
 int x=20;
}
class Demo2 extends Sample1
{
void disp()
	{ 
	System.out.println("run disp........");

}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Sample1 s1=new Demo2();
System.out.println(s1.x);
System.out.println("*****downcasting******");
Demo2 d1=(Demo2)s1;
d1.disp();
System.out.println(d1.x);
	}
}
