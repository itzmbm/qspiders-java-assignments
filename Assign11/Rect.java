class  Rect				
{
 void area(double w,double h)
{

 double area=w*h;
 System.out.println("area of rectangle   is"+area);
}
public static void main(String []args)
{

  Rect r1=new Rect();
  r1.area(4.14,5.15);
}
}