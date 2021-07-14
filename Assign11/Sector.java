class  Sector
{
void area(double tita,int f)
{
 double area=0.5*f*f*tita;
 System.out.println("area of Sector   is"+area);
}
public static void main(String []args)
{

  Sector s1=new Sector();
  s1.area(5.13,2);
 
}
}