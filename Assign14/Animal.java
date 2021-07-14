class Animal
{
int animal_cost;
String animal_name;
Animal(int a,String b)
{
animal_cost=a;
animal_name=b;
}
public static void main(String args[])
{
Animal a=new Animal(11000,"golden retriever");
System.out.println(a.animal_cost);
System.out.println(a.animal_name);
}
}