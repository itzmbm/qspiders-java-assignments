class Ellipse
{
 void area()
 {
  final double pi=3.142;
 int a=6,b=6 ;
  double result=pi*a*b;
  System.out.println("area of Ellipse is"+result);
 }
 public static void main(String []args)
 {
  new Ellipse().area();
 }
}