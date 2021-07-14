class  Square
{
 void area(float a)
{
 double area= a*a;
 System.out.println("area of Square   is"+area);
}
public static void main(String []args)
{
  Square s1=new Square();
  s1.area(13.5f);
}
}