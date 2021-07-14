class Employee
{
int emp_id;
int emp_sal;
String emp_name;
Employee(int emp_id,int emp_sal,String emp_name)
{
this.emp_id=emp_id;
this.emp_sal=emp_sal;
this.emp_name=emp_name;
}
public static void main(String args[])
{
Employee e=new Employee(107,25000,"mbm");
System.out.println(e.emp_id);
System.out.println(e.emp_sal);
System.out.println(e.emp_name);
}
}