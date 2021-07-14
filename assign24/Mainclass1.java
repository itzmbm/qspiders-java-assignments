package assign24;

 class Paytm 
{
private int pin=2244;
public int getPin()
{
	return pin;
}
public void setPin(int a)
{
	pin=a;
}
}
class Mainclass1
{
	public static void main(String args[])
{
		Paytm p=new Paytm();
int b=p.getPin();
System.out.println(b);
p.setPin(1212);
System.out.println(p.getPin());
		}
}
