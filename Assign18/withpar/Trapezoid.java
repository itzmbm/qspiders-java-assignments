class Area3
{
void area(int a,int b,int h)
{
double result=0.5*(a+b)*h;
System.out.println(result);
}
}
class Trapezoid
{
public static void main(String args[])
{
Area3 a=new Area3();
a.area(2,3,4);
}
}
