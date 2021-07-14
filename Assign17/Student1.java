class Student1
{
static void needjob(Jspiders j2)
{
j2.develop();
}
}
class Jspiders
{
void develop()
{
System.out.println("get a job");
}
public static void main(String args[])
{
Jspiders j1=new Jspiders();
Student1.needjob(j1);
}
}
