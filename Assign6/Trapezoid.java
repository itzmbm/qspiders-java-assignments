
 class Area
{
 static double area()
 {
  double h=5;
  int a=5,b=5;
  double result=0.5*(a+b)*h;
  return(result);
 }
 }
 
 class Trapezoid
{
 public static void main(String []args)
 {
  double x=Area.area();
    System.out.println(x);
 
 }
} 
