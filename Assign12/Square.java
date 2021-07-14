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
 Square s1=new Square();
  System.out.println("area of Square is  "+ s1.area());
 }
}