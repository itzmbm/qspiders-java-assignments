package assign24;

class Bank
{
	private String name="MBM";
	public String getName()
	{
		return name;
	}
	public void setName(String a)
	{
		name=a;
	}
}
public class Mainclass4 
{
public static void main(String args[])
{
	Bank b=new Bank();
	String x=b.getName();
	System.out.println(x);
	b.setName("MBAAAA");
	System.out.println(b.getName());
}
}
