class Chair
{
int chair_cost;
String chair_color;
Chair(int chair_cost,String chair_color)
{
this.chair_cost=chair_cost;
this.chair_color=chair_color;
}
public static void main(String args[])
{
Chair c=new Chair(1000,"Red");
System.out.println(c.chair_cost);
System.out.println(c.chair_color);
}
}