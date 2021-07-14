class Dominos
{
static void pizza(int price)
{
System.out.println(price);
}
static void pizza(int price,String type)
{
System.out.println(price+" "+type);
}
}
class Mainclass
{
public static void main(String args[])
{
Dominos.pizza(199);
Dominos.pizza(99,"veg");
}
}
