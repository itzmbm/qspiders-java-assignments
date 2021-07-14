class Parallelogram
{
 double area()
 {
  
  int b=5,h=3;
  double result=b*h;
  return(result);
 }
 public static void main(String []args)
 {
  System.out.println("area of Parallelogram is  " +new Parallelogram().area());
 }
}