class Ellipse1
{
static void area(int a,int b)
{ 
final double pi=3.142;
double result=pi*a*b;
System.out.println("area of ellipse is "+result);
}
public static void main(String args[])
{
System.out.println("***main starts***");
area(2,3);
System.out.println("***main ends***");
}
}