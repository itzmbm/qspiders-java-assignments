class Bag
{
int bag_cost;
String bag_brand;
Bag(int bag_cost,String bag_brand)
{
this.bag_cost=bag_cost;
this.bag_brand=bag_brand;
}
public static void main(String args[])
{
Bag b=new Bag(799,"Wildcraft");
System.out.println(b.bag_cost);
System.out.println(b.bag_brand);
}
}