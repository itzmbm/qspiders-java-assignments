class Circle
{
 void area()
{
 final double PI=3.142;
 int r=5;
 double result=PI*r*r;
 System.out.println("area of circle is"+result);
}
public static void main(String []args)
{
  new Circle().area();
}
}