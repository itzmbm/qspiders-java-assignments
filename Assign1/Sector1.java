class Sector1
{
static void area(int r,double t)
{
double result=0.5*r*r*t;
System.out.println("area of sector is "+result);
}
public static void main(String args[])
{
System.out.println("***main starts***");
area(5,35.9);
System.out.println("***main ends***");
}
}