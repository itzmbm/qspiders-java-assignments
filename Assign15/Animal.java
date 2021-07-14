class Animal
{
int animal_cost;
String animal_name;
Animal(int animal_cost,String animal_name)
{
this.animal_cost=animal_cost;
this.animal_name=animal_name;
}
public static void main(String args[])
{
Animal a=new Animal(11000,"golden retriever");
System.out.println(a.animal_cost);
System.out.println(a.animal_name);
}
}