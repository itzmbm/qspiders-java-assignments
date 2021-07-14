class Food
{
void biriyani(int cost,String type)
{
System.out.println(cost+type);
}
}
class Eating extends Food
{
void biriyani(int cost,String type,String style)
{
System.out.println(cost+type+style);
}
}
class Mainclass5
{
public static void main(String args[])
{
Eating e=new Eating();
e.biriyani(199,"chicken");
e.biriyani(250,"ambur","mutton");
}
}
