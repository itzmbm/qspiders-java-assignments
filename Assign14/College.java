class College
{
char college_grade;
String college_name;
College(char a,String b)
{
college_grade=a;
college_name=b;
}
public static void main(String args[])
{
College c1=new College('A',"Bmsit");
System.out.println(c1.college_grade);
System.out.println(c1.college_name);
}
}