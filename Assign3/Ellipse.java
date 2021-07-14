class Ellipse
{
 static double area()
 {
  final double pi=3.142;
 int a=6,b=6 ;
  double result=pi*a*b;
  return(result);
 }
 public static void main(String []args)
 {
  System.out.println("----------main start-------------");
    System.out.println("area of Ellipse is"+area());
  System.out.println("----------main end-------------");
 }
}