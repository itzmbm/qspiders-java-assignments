class Circle1
{
static void area(double pi,int r)
{
double result=pi*r*r;
System.out.println(result);
}
public static void main(String args[])
{
System.out.println("***main starts***");
area(3.142,5);
System.out.println("***main ends***");
}
}