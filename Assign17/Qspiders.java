class Student
{
static void needjob(Qspiders q2)
{
q2.testengg();
}
}
class Qspiders
{
void testengg()
{
System.out.println("get a job");
}
public static void main(String args[])
{
Qspiders q1=new Qspiders();
Student.needjob(q1);
}
}
