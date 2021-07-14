class Area4
{
double area()
{
int a=5;
int b=5;
final double pi=3.142;
double result=pi*a*b;
return result;
}
}
class Ellipse1
{
public static void main(String args[])
{
Area4 a=new Area4();
System.out.println(a.area());
}
}