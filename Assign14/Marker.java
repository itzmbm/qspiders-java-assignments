class Marker
{
int marker_cost;
String marker_brand;
String marker_color;
Marker(int a,String b,String c)
{
marker_cost=a;
marker_brand=b;
marker_color=c;
}
public static void main(String args[])
{
Marker m=new Marker(75,"Camlin","Red");
System.out.println(m.marker_cost);
System.out.println(m.marker_brand);
System.out.println(m.marker_color);
}
}