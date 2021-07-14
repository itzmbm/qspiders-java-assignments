class Car
{
String car_name;
int car_cost;
Car(String car_name,int car_cost)
{
this.car_name=car_name;
this.car_cost=car_cost;
}
public static void main(String args[])
{
Car c=new Car("BMW",8500000);
System.out.println(c.car_name);
System.out.println(c.car_cost);
}
}