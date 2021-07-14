class Area1
{
void area(int r)
{
final double pi=3.142;
double result=pi*r*r;
System.out.println(result);
}
}
class Circle
{
public static void main(String args[])
{
Area1 a=new Area1();
a.area(5);
}
}
