class Juice
{
String juice_type;
int juice_cost;
String juice_color;
Juice(String juice_type,int juice_cost,String juice_color)
{
this.juice_type=juice_type;
this.juice_cost=juice_cost;
this.juice_color=juice_color;
}
public static void main(String args[])
{
Juice j=new Juice("fruits",45,"purple");
System.out.println(j.juice_type);
System.out.println(j.juice_cost);
System.out.println(j.juice_color);
}
}