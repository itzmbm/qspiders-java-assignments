package assign23;

interface Fruits_shop
{
void purchase();
}
class Mango implements Fruits_shop
{
public void purchase()
{
System.out.println("Mango");
}
}
class Orange implements Fruits_shop
{
public void purchase()
{
System.out.println("Orange");
}
}
class Grapes implements Fruits_shop
{
public void purchase()
{
System.out.println("Grapes");
}
}
class Stimulator1
{
static void fruit_sim(Fruits_shop f1)
{
f1.purchase();
}
}
class Mainclass1
{
public static void main(String args[])
{
Mango m1=new Mango();
Orange o1=new Orange();
Grapes g1=new Grapes();

System.out.println("main starts");
Stimulator1.fruit_sim(m1);
Stimulator1.fruit_sim(o1);
Stimulator1.fruit_sim(g1);
System.out.println("main ends");
}
}
