class Pubg0_8
{
void maps()
{
System.out.println("Erangel and Miramar");
}
}
class Pubg0_9 extends Pubg0_8
{
void maps()
{
	super.maps();
System.out.println("Sanhok");
}
}
class Mainclass3
{
public static void main(String args[])
{
Pubg0_9 p=new Pubg0_9();
p.maps();
}
}
