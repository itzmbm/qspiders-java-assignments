 class Car
{
String car_name;
int car_cost;
   Car(String a,int b)
{
car_name=a;
car_cost=b;
}
public static void main(String args[])
{
Car c1=new Car("Ford",2000000);
System.out.println(c1.car_name);
System.out.println(c1.car_cost);
}
}
