class Sector
{
 double area()
 {
  double tita=5.13;
  int f=2;
  double result=0.5*f*f*tita;
  return(result);
 }
 public static void main(String []args)
 {
 Sector s1=new Sector();
  System.out.println("area of Sector is  "+s1.area());
 }
}