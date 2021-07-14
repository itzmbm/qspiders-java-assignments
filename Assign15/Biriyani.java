class Biriyani
{
int biriyani_cost;
String biriyani_type;
Biriyani(int biriyani_cost,String biriyani_type)
{
this.biriyani_cost=biriyani_cost;
this.biriyani_type=biriyani_type;
}
public static void main(String args[])
{
Biriyani b=new Biriyani(149,"Ambur");
System.out.println(b.biriyani_cost);
System.out.println(b.biriyani_type);
}
}