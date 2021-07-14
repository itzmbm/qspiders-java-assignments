class Sector
{
 static double area()
 {
  double tita=5.13;
  int f=2;
  double result=0.5*f*f*tita;
  return(result);
 }
 public static void main(String []args)
 {
  System.out.println("----------main start-------------");
  System.out.println("area of Sector is  "+ area());
  System.out.println("----------main ends-------------");
 }
}