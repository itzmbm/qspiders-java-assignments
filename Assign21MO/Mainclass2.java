class Cafe
{
static void coffee(int price)
{
System.out.println(price);
}
static void coffee(int price,String type)
{
System.out.println(price+" "+type);
}
}
class Mainclass2
{
public static void main(String args[])
	{
Cafe.coffee(59);
Cafe.coffee(150,"Essperso");
}
}