package assign23;

interface Mobiles
{
void manufacture();
}
class Samsung implements Mobiles
{
public void manufacture()
{
System.out.println("samsung");
}
}
class Lenovo implements Mobiles
{
public void manufacture()
{
System.out.println("lenovo");
}
}
class Motorola implements Mobiles
{
public void manufacture()
{
System.out.println("motorola");
}
}
class Stimulator
{
static void electronics_sim(Mobiles m1)
{
m1.manufacture();
}
}
class Mainclass
{
public static void main(String args[])
{
Samsung s1=new Samsung();
Lenovo l1=new Lenovo();
Motorola m2=new Motorola();

System.out.println("main starts");
Stimulator.electronics_sim(s1);
Stimulator.electronics_sim(l1);
Stimulator.electronics_sim(m2);
System.out.println("main ends");
}
}
