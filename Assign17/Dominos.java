class Customer
{
static void hungry(Dominos d2)
{
d2.pizza();
}
}
class Dominos
{
void pizza()
{
System.out.println("eat pizza");
}
public static void main(String args[])
{
Dominos d1=new Dominos();
Customer.hungry(d1);
}
}
