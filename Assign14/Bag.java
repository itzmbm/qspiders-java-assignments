class Bag
{
int bag_cost;
String bag_brand;
Bag(int a,String b)
{
bag_cost=a;
bag_brand=b;
}
public static void main(String args[])
{
Bag b=new Bag(799,"Wildcraft");
System.out.println(b.bag_cost);
System.out.println(b.bag_brand);
}
}