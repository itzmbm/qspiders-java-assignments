class Area
{
static void area(int r,double t)
{
double result=0.5*r*r*t;
System.out.println(result);
}
}
class Sector
{
public static void main(String args[])
{
Area.area(5,35.9);
}
}