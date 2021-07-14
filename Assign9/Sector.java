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
  System.out.println("area of Sector is  "+new Sector().area());
 }
}