package assign23;

interface Hospital
{
void tests();
}
class Fever implements Hospital
{
public void tests()
{
System.out.println("test for fever");
}
}
class Cancer implements Hospital
{
public void tests()
{
System.out.println("test for cancer");
}
}
class Migrane implements Hospital
{
public void tests()
{
System.out.println("test for migrane");
}
}
class Stimulator3
{
static void test_sim(Hospital h1)
{
h1.tests();
}
}
class Mainclass3
{
public static void main(String args[])
{
Fever f1=new Fever();
Cancer c1=new Cancer();
Migrane m1=new Migrane();
System.out.println("main starts");
Stimulator3.test_sim(f1);
Stimulator3.test_sim(c1);
Stimulator3.test_sim(m1);
System.out.println("main ends");
}
}
