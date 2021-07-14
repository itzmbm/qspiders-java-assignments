class  Circle
{
 void area(int r,double PI)
{
 double area=PI*r*r;
 System.out.println("area of circle is"+area);
}
public static void main(String []args)
{
 Circle c1=new Circle();
 c1.area(5,3.142);
}
}