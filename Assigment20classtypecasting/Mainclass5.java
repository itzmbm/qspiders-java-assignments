class Duster 
{
 void go()
	{ 
	System.out.println("run go()........");

}

}
class Job extends Duster
{
void money()
	{ 
	System.out.println("need money........");

}
}
class Mainclass5
{
	public static void main(String[] args) 
	{
		System.out.println("**upcasting**");
Duster d=new Job();
d.go();
System.out.println("*****downcasting******");
Job j=(Job)d;
j.money();

j.go();
	}
}
