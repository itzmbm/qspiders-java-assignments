package assign23;

interface Amazon
{
void order();
}
class Women implements Amazon
{
public void order()
{
System.out.println("Women's cloth");
}
}
class Men implements Amazon
{
public void order()
{
System.out.println("Men's cloth");
}
}
class Kids implements Amazon
{
public void order()
{
System.out.println("Kids cloth");
}
}
class Stimulator4
{
static void amazon_sim(Amazon a1)
{
a1.order();
}
}
class Mainclass4
{
public static void main(String args[])
{
Women w1=new Women();
Men m1=new Men();
Kids k1=new Kids();


System.out.println("main starts");
Stimulator4.amazon_sim(w1);
Stimulator4.amazon_sim(m1);
Stimulator4.amazon_sim(k1);
System.out.println("main ends");
}
}
