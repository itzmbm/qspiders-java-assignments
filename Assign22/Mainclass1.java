class Electronics
{
void type()
{
System.out.println(" buy");
}
}
class Desktop extends Electronics
{
void type()
{
System.out.println("Desktop");
}
}
class Laptop extends Electronics
{
void type()
{
System.out.println("Laptop");
}
}
class Mobile extends Electronics
{
void type()
{
System.out.println("Mobile");
}
}
class Stimulator
{
static void elec_sim(Electronics e1)
{
e1.type();
}
}
class Mainclass1
{
public static void main(String args[])
{
Desktop d1=new Desktop();
Laptop l1=new Laptop();
Mobile m1=new Mobile();
System.out.println("main starts");
Stimulator.elec_sim(d1);
Stimulator.elec_sim(l1);
Stimulator.elec_sim(m1);
System.out.println("main ends");
}
}