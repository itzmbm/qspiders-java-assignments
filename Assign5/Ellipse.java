class Area
{
static void area(int a,int b)
{ 
final double pi=3.142;
double result=pi*a*b;
System.out.println(result);
}
}
class Ellipse
{
public static void main(String args[])
{
Area.area(2,3);
}
}