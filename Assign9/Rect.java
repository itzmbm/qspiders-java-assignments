class Rect
{
  double area()
 {
  double w=4.15,h=5.13;
  double result=w*h;
  return(result);
 }
 public static void main(String []args)
 {	
   System.out.println("area of Rectangle is"+new Rect().area());
}
}