class College
{
char college_grade;
String college_name;
College(char college_grade,String college_name)
{
this.college_grade=college_grade;
this.college_name=college_name;
}
public static void main(String args[])
{
College c=new College('A',"Bmsit");
System.out.println(c.college_grade);
System.out.println(c.college_name);
}
}