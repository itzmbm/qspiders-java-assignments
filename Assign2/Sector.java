class Sector
{
  static void area()
	{
   int r=5;
   double t=30.5;
  double result=0.5*r*r*t;
  System.out.println("area of the sector is" + result);
  }
  public static void main(String args[])
  {
  System.out.println("*******Main starts********");
  area();
  System.out.println("*******Main ends********");
}
}