class Trapezoid
{
  void area()
 {
  double h=5.13;
  int a=5,b=5;
  double result=0.5*(a+b)*h;
  System.out.println("area of Trapeziod is"+result);
 }
 public static void main(String []args)
 {
  new Trapezoid().area();
 }
}