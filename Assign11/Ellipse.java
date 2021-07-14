class  Ellipse
{
 void area(int a,int b,double PI)
{
 ;
 double area=PI*a*b;
 System.out.println("area of Ellipse is"+area);
}
public static void main(String []args)
{

  Ellipse e1=new Ellipse();
  e1.area(6,6,3.142);

}
}