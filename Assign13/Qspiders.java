class Qspiders
{
int java_mock;
public static void  main(String args[])
{
Qspiders std1=new Qspiders();
Qspiders std2=new Qspiders();
std1.java_mock=1;
System.out.println(std1.java_mock);
std2.java_mock=2;
System.out.println(std2.java_mock);
std2.java_mock=1;
System.out.println(std2.java_mock);
}
}
