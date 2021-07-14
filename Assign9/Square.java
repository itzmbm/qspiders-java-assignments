class Square
{
  double area()
 {
  
  float a=13.5f;
  double result=a*a;
  return(result);
 }
 public static void main(String []args)
 {
  System.out.println("area of Square is  "+ new Square().area());
 }
}