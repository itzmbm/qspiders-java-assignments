class Client
{
static void request(Server s2)
{
s2.response();
}
}
class Server
{
void response()
{
System.out.println("login page");
}
public static void main(String args[])
{
Server s1=new Server();
Client.request(s1);
}
}
