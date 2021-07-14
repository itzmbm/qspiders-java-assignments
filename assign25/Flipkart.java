package assign25;

public class Flipkart {
static void submit() throws OfferException
{
	int order_amt=999;
	if(order_amt>=9999)
	{
		System.out.println("flat rs 999 off");
	}
	else
	{
		throw new OfferException("no offer");
	}
}
	public static void main(String args[])
	{
		try{
			submit();
		}
		catch(OfferException e)
		{
			System.out.println(e.getOffer());
		}
	}
}
class OfferException extends Exception
{
	String msg;
	OfferException(String msg)
	{
		this.msg=msg;
	}
	String getOffer()
	{
		return msg;
	}
}

