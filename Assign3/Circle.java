class Circle
{
static double area()
{
 final double PI=3.142;
 int r=5;
 double result=PI*r*r;
return result;
}
public static void main(String []args)
{
 System.out.println("----------main start-------------");
  System.out.println("area of circle is"+ area());
 System.out.println("----------main end-------------");
}
}