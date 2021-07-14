class Course
{
int course_fees;
String course_name;
Course(int course_fees,String course_name)
{
this.course_fees=course_fees;
this.course_name=course_name;
}
public static void main(String args[])
{
Course c=new Course(25000,"softwaretesting");
System.out.println(c.course_fees);
System.out.println(c.course_name);
}
}