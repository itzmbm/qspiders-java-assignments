class Ola
{
void book(String type,int cost)
{
System.out.println(type+" "+cost);
}
void book(String car,String type,int cost)
{
System.out.println(car+type+cost);
}
}
class Mainclass4
{
public static void main(String args[])
{
Ola o=new Ola();
o.book("solo",300);
o.book("swift desire","pool",150);
}
}
