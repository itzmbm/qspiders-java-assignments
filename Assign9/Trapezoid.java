class Trapezoid
{
 double area()
 {
  double h=5.13;
  int a=5,b=5;
  double result=0.5*(a+b)*h;
  return(result);
 }
 public static void main(String []args)
 {
  System.out.println("area of Trapezoid is"+new Trapezoid().area());
 }
}