class Tester1 
{
 void disp()
	{ 
	System.out.println("run disp........");

}

}
class Camalin extends Tester1
{
void easy()
	{ 
	System.out.println("run easy........");

}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Tester1 t1=new Camalin();
t1.disp();
System.out.println("*****downcasting******");
Camalin c1=(Camalin)t1;
c1.easy();
c1.disp();
	}
}
