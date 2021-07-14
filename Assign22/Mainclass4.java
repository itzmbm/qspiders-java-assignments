class Laptops
{
void brand()
{
System.out.println(" brand ");
}
}
class Hp extends Laptops
{
void brand()
{
System.out.println("Hp");
}
}
class Dell extends Laptops
{
void brand()
{
System.out.println("Dell");
}
}
class Lenovo extends Laptops
{
void brand()
{
System.out.println("Lenovo");
}
}
class Stimulator
{
static void laptop_sim(Laptops l1)
{
l1.brand();
}
}
class Mainclass4
{
public static void main(String args[])
{
Hp h1=new Hp();
Dell d1=new Dell();
Lenovo l2=new Lenovo();

System.out.println("main starts");
Stimulator.laptop_sim(h1);
Stimulator.laptop_sim(d1);
Stimulator.laptop_sim(l2);
System.out.println("main ends");
}
}