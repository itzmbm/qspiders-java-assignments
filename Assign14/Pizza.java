class Pizza
{
int pizza_cost;
String pizza_flavour;
Pizza(int a,String b)
{
pizza_cost=a;
pizza_flavour=b;
}
public static void main(String args[])
{
Pizza p=new Pizza(99,"cheese");
System.out.println(p.pizza_cost);
System.out.println(p.pizza_flavour);
}
}