class Trapeziod
{
 static double area()
 {
  double h=5.13;
  int a=5,b=5;
  double result=0.5*(a+b)*h;
  return(result);
 }
 public static void main(String []args)
 {
  System.out.println("----------main start-------------");
  System.out.println("area of Trapeziod is"+ area());
  System.out.println("----------main end-------------");
 }
}