class  Circle
{
 void area(int r,double PI)
{
 double area=PI*r*r;
 System.out.println("area of circle is"+area);
}
public static void main(String []args)
{
  new Circle().area(5,3.142);
}
}