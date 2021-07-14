package assign25;

public class Tinder {
static void  submit() throws DatingException
{
	int age=16;
	if(age>=18)
	{
		System.out.println("love life");
	}
	else
	{
		throw new DatingException("invalid age");
	}
}
	public static void main(String args[])
	{
		try{
			submit();
		}
		catch(DatingException e)
		{
			System.out.println(e.getMsg());
		}
	}
}
class DatingException extends Exception
{
	String msg;
	DatingException(String msg)
	{
		this.msg=msg;
	}
	String getMsg()
	{
		return msg;
	}
}
