class  Triangle
{
 void area(double b,double h)
{

 double area=0.5*b*h;
 System.out.println("area of Triangle   is"+area);
}
public static void main(String []args)
{
Triangle t1 =new Triangle();
t1.area(5.13,5.13);
}
}