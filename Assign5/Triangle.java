class Area
{
static void area(int b,int h)
{
double result=0.5*b*h;
System.out.println("area of triangle is "+result);
}
}
class Triangle
{

public static void main(String args[])
{

Area.area(5,7);
}
}