class Hike
{
void send(int no)
{
System.out.println(no);
}
void send(String msg)
{
System.out.println(msg);
}
void send(int no,String msg)
{
System.out.println(no+msg);
}
}
class Mainclass3
{
public static void main(String args[])
{
Hike h=new Hike();
h.send(11);
h.send("java");
h.send(108,"java");
}
}
