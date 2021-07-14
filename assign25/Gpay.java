package assign25;

public class Gpay {
static void  send() throws GpayException
{
	int amt=40;
	if(amt>=51)
	{
		System.out.println("flat rs 51 cashback");
	}
	else
	{
		throw new GpayException("no offer");
	}
}
	public static void main(String args[])
	{
		try{
			send();
		}
		catch(GpayException e)
		{
			System.out.println(e.getMsg());
		}
	}
}
class  GpayException extends Exception
{
	String msg;
	GpayException(String msg)
	{
		this.msg=msg;
	}
	String getMsg()
	{
		return msg;
	}
}
