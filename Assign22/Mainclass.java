class Ecommerce
{
void buy()
{
System.out.println(" buy");
}
}
class Flipkart extends Ecommerce
{
void buy()
{
System.out.println("Flipkart");
}
}
class Amazon extends Ecommerce
{
void buy()
{
System.out.println("Amazon");
}
}
class Snapdeal extends Ecommerce
{
void buy()
{
System.out.println("Snapdeal");
}
}
class Stimulator
{
static void ecomsim(Ecommerce e1)
{
e1.buy();
}
}
class Mainclass
{
public static void main(String args[])
{
Flipkart f1=new Flipkart();
Amazon a1=new Amazon();
Snapdeal s1=new Snapdeal();
System.out.println("main starts");
Stimulator.ecomsim(f1);
Stimulator.ecomsim(a1);
Stimulator.ecomsim(s1);
System.out.println("main ends");
}
}
