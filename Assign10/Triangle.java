class Triangle
{
  void area()
 {
  double b=5.13,h=5.13;
  double result=0.5*b*h;
  System.out.println("area of triangle is"+result);
 }
 public static void main(String []args)
 {
   Triangle t1=new Triangle();
   t1.area();
 }
}