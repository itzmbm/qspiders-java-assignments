class Area2
{
int area()
{
int w=5;
int h=7;
int result=w*h;
return result;
}
}
class Rect1
{
public static void main(String args[])
{
Area2 a=new Area2();
System.out.println(a.area());
}
}