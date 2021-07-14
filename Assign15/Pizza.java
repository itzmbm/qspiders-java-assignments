class Pizza
{
int pizza_cost;
String pizza_flavour;
Pizza(int pizza_cost,String pizza_flavour)
{
this.pizza_cost=pizza_cost;
this.pizza_flavour=pizza_flavour;
}
public static void main(String args[])
{
Pizza p=new Pizza(99,"cheese");
System.out.println(p.pizza_cost);
System.out.println(p.pizza_flavour);
}
}