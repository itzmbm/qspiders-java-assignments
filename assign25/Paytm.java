package assign25;

public class Paytm {
static void  recharge() throws PaytmException
{
	int amt=119;
	if(amt>=199)
	{
		System.out.println("flat rs 50 off");
	}
	else
	{
		throw new PaytmException("no offer");
	}
}
	public static void main(String args[])
	{
		try{
			recharge();
		}
		catch(PaytmException e)
		{
			System.out.println(e.getMsg());
		}
	}
}
class PaytmException extends Exception
{
	String msg;
	PaytmException(String msg)
	{
		this.msg=msg;
	}
	String getMsg()
	{
		return msg;
	}
}
