package assign24;

class Kbl
{
	private int pin=2004;
	public int getPin()
	{
		return pin;
	}
	public void setPin(int a)
	{
		pin=a;
	}
}
public class Mainclass3 {
public static void main(String args[])
{
	Kbl k=new Kbl();
	int b=k.getPin();
	System.out.println(b);
k.setPin(1998);
System.out.println(k.getPin());
}
}
