 class Area
{
 static double area()
 {
  double t=30.5;
  int r=5;
  double result=0.5*r*r*t;
  return(result);
 }
 }
 class Sector
{
 public static void main(String []args)
 {
  double x=Area.area();
    System.out.println(x);
 
 }
} 