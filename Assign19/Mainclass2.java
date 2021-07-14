class Laptop1
{
void storage()
{
System.out.println("1TB hdd");
}
}
class Laptop2 extends Laptop1
{
void storage()
{
System.out.println("1TB hdd & 128GB ssd");
}
}
class Mainclass2
{
public static void main(String args[])
{
Laptop2 l=new Laptop2();
l.storage();
}
}
