class Employee
{
int emp_id;
int emp_sal;
String emp_name;
Employee(int a,int b,String c)
{
emp_id=a;
emp_sal=b;
emp_name=c;
}
public static void main(String args[])
{
Employee e=new Employee(107,25000,"mbm");
System.out.println(e.emp_id);
System.out.println(e.emp_sal);
System.out.println(e.emp_name);
}
}