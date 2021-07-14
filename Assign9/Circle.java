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
  System.out.println("area of circle is"+ new Circle().area());
}
}

