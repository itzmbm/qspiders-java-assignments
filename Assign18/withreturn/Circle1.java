class Area1
{
double area()
{
final double pi=3.142;
int r=5;
double result=pi*r*r;
return result;
}
}
class Circle1
{
public static void main(String args[])
{
Area1 a=new Area1();
System.out.println(a.area());
}
}