class Area3
{
double area()
{
int a=5;
int b=7;
int h=5;
double result=0.5*(a+b)*h;
return result;
}
}
class Trapezoid1
{
public static void main(String args[])
{
Area3 a=new Area3();
System.out.println(a.area());
}
}