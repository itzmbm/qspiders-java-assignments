class Laptop
{
int laptop_cost;
String laptop_name;
String laptop_color;
Laptop(int a,String b, String c)
{
laptop_cost=a;
laptop_name=b;
laptop_color=c;
}
public static void main(String args[])
{
Laptop l=new Laptop(54000,"HP","grey");
System.out.println(l.laptop_cost);
System.out.println(l.laptop_name);
System.out.println(l.laptop_color);
}
}