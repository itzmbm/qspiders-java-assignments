class Course
{
int course_fees;
String course_name;
Course(int a,String b)
{
course_fees=a;
course_name=b;
}
public static void main(String args[])
{
Course c=new Course(25000,"softwaretesting");
System.out.println(c.course_fees);
System.out.println(c.course_name);
}
}