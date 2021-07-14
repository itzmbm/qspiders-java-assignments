class Sector
{
  void area()
 {
  double tita=5.13;
  int f=2;
  double result=0.5*f*f*tita;
  System.out.println("area of Sector is  "+result);
 }
 public static void main(String []args)
 {
   Sector s1=new Sector();
   s1.area();
 }
}