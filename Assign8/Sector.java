class  Sector
{
void area(double tita,int f)
{
 double area=0.5*f*f*tita;
 System.out.println("area of Sector   is"+area);
}
public static void main(String []args)
{

  new Sector().area(5.13,2);
 
}
}