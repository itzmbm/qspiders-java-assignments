class  Trapezoid
{
 void area(double h,int a,int b)
{
 double area=0.5*(a+b)*h;
 System.out.println("area of Trapezoid is"+area);
}
public static void main(String []args)
{

 Trapezoid t1=new Trapezoid();
 t1.area(5.13,5,5);
}
}