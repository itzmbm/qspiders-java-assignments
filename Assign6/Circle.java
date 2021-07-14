class Area
{
static double area()
{
int r=5;
final double pi=3.142;
double result=pi*r*r;
return result;
}
}
class Circle 
{
public static void main(String args[])
{
double x=Area.area();
System.out.println(x);
}
}

