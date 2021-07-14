class Area8
{
void area(int r,double t)
{
double result=0.5*r*r*t;
System.out.println(result);
}
}
class Sector
{
public static void main(String args[])
{
Area8 a=new Area8();
a.area(5,39.5);
}
}
