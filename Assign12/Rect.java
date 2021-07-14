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
 Rect r1=new Rect();
   System.out.println("area of Rectangle is"+r1.area());
}
}