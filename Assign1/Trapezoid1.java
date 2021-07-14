class Trapezoid1
{
static void area(int a,int b,int h)
{
double result=0.5*(a+b)*h;
System.out.println("area of trapezoid is "+result);
}
public static void main(String args[])
{
System.out.println("***main starts***");
area(2,3,4);
System.out.println("***main ends***");
}
}