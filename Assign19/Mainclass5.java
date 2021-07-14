class Phone1
{
void lock()
{
System.out.println("Passcode and Pattern");
}
}
class Phone2 extends Phone1
{
void lock()
{
super.lock();
System.out.println("Fingerprint and Face unlock");
}
}
class Mainclass5
{
public static void main(String args[])
	{
Phone2 p=new Phone2();
p.lock();
}
}
