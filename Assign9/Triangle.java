class Triangle
{
  double area()
 {
  double b=5.13,h=5.13;
  double result=0.5*b*h;
  return(result);
 }
 public static void main(String []args)
 {
   System.out.println("area of tirangle is"+new Triangle().area());
 }
}