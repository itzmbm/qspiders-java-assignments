class Biriyani
{
int biriyani_cost;
String biriyani_type;
Biriyani(int a,String b)
{
biriyani_cost=a;
biriyani_type=b;
}
public static void main(String args[])
{
Biriyani b=new Biriyani(149,"Ambur");
System.out.println(b.biriyani_cost);
System.out.println(b.biriyani_type);
}
}