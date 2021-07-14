class Area7
{
double area()
{
int b=5;
int h=5;
double result=0.5*b*h;
return result;
}
}
class Triangle1
{
public static void main(String args[])
{
Area7 a=new Area7();
System.out.println(a.area());
}
}