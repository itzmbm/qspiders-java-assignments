class Marker
{
int marker_cost;
String marker_brand;
String marker_color;
Marker(int marker_cost,String marker_brand,String marker_color)
{
this.marker_cost=marker_cost;
this.marker_brand=marker_brand;
this.marker_color=marker_color;
}
public static void main(String args[])
{
Marker m=new Marker(75,"Camlin","Red");
System.out.println(m.marker_cost);
System.out.println(m.marker_brand);
System.out.println(m.marker_color);
}
}