class Circle
{
 double area()
{
 final double PI=3.142;
 int r=5;
 double result=PI*r*r;
return result;
}
public static void main(String []args)
{
Circle c1=new Circle();
  System.out.println("area of circle is"+ c1.area());
}
}