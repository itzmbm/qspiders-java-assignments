class Juice
{
String juice_type;
int juice_cost;
String juice_color;
Juice(String a,int b,String c)
{
juice_type=a;
juice_cost=b;
juice_color=c;
}
public static void main(String args[])
{
Juice j=new Juice("fruits",45,"purple");
System.out.println(j.juice_type);
System.out.println(j.juice_cost);
System.out.println(j.juice_color);
}
}