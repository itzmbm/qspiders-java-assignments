class Chair
{
String chair_color;
int chair_cost;
Chair(String a,int b)
{
chair_color=a;
chair_cost=b;
}
public static void main(String args[])
{
Chair c1=new Chair("Red",1000);
System.out.println(c1.chair_color);
System.out.println(c1.chair_cost);
}
}