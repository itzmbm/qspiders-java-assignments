class Processor
{
void brand()
{
System.out.println(" brand ");
}
}
class Intel extends Processor
{
void brand()
{
System.out.println("Intel");
}
}
class Amd extends Processor
{
void brand()
{
System.out.println("Amd");
}
}
class Qualcomm extends Processor
{
void brand()
{
System.out.println("Qualcomm");
}
}
class Stimulator
{
static void pro_sim(Processor p1)
{
p1.brand();
}
}
class Mainclass3
{
public static void main(String args[])
{
Intel i1=new Intel();
Amd a1=new Amd();
Qualcomm q1=new Qualcomm();

System.out.println("main starts");
Stimulator.pro_sim(i1);
Stimulator.pro_sim(a1);
Stimulator.pro_sim(q1);
System.out.println("main ends");
}
}