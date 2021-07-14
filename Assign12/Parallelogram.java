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
 Parallelogram p1=new Parallelogram();
  System.out.println("area of Parallelogram is  " +p1.area());
 }
}