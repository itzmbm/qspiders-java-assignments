package assign25;

public class Phonepe {
static void  elec_bill() throws PhonepeException
{
	int amt=998;
	if(amt>=999)
	{
		System.out.println("flat rs 100 cashback");
	}
	else
	{
		throw new PhonepeException("no offer");
	}
}
	public static void main(String args[])
	{
		try{
			elec_bill();
		}
		catch(PhonepeException e)
		{
			System.out.println(e.getMsg());
		}
	}
}
class PhonepeException extends Exception
{
	String msg;
	PhonepeException(String msg)
	{
		this.msg=msg;
	}
	String getMsg()
	{
		return msg;
	}
}
