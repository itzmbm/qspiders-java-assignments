class Laptop
{
int laptop_cost;
String laptop_name;
String laptop_color;
Laptop(int laptop_cost,String laptop_name, String laptop_color)
{
this.laptop_cost=laptop_cost;
this.laptop_name=laptop_name;
this.laptop_color=laptop_color;
}
public static void main(String args[])
{
Laptop l=new Laptop(54000,"HP","grey");
System.out.println(l.laptop_cost);
System.out.println(l.laptop_name);
System.out.println(l.laptop_color);
}
}