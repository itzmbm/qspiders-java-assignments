class Nougat
{
void AI()
{
System.out.println("google assistant");
}
}
class Pie extends Nougat
{
void AI()
{
System.out.println("google assistant and google duplex");
}
}
class Mainclass1
{
public static void main(String args[])
{
Pie p=new Pie();
p.AI();
}
}