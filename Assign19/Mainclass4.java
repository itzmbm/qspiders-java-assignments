class Pixel2
{
void display()
{
System.out.println("18:9 ratio display");
}
}
class Pixel3 extends Pixel2
{
void display()
{
System.out.println("19:9 ratio with notch display");
}
}
class Mainclass4
{
public static void main(String args[])
{
Pixel3 p=new Pixel3();
p.display();
}
}