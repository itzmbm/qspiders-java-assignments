class Student
{
static void result(Teacher t2)
{
t2.sendresult();
}
}
class Teacher
{
void sendresult()
{
System.out.println("the result is 75%");
}
public static void main(String args[])
{
Teacher t1=new Teacher();
Student.result(t1);
}
}
