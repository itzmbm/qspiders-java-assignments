class  Square
{
 void area(float a)
{
 double area= a*a;
 System.out.println("area of Square   is"+area);
}
public static void main(String []args)
{
  new Square().area(13.5f);
}
}