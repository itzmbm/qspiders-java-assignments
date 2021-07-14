class Area8
{
double area()
{
int r=5;
double t=35.9;
double result=0.5*r*r*t;
return result;
}
}
class Sector1
{
public static void main(String args[])
{
Area8 a=new Area8();
System.out.println(a.area());
}
}