package assign24;

class Phonepe
{
	private int pin=7777;
	public int getPin()
	{
		return pin;
	
	}
	public void setPin(int x)
{
		pin=x;
		}
}
public class Mainclass2 {
	public static void main(String args[])
	{
	Phonepe p=new Phonepe();
	int y=p.getPin();
	System.out.println(y);
	p.setPin(3333);
	System.out.println(p.getPin());
	}
}
