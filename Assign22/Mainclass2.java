class Games
{
void fps()
{
System.out.println(" fps games");
}
}
class Csgo extends Games
{
void fps()
{
System.out.println("CS go");
}
}
class Pubg extends Games
{
void fps()
{
System.out.println("Pubg");
}
}
class Cod extends Games
{
void fps()
{
System.out.println("COD");
}
}
class Stimulator
{
static void game_sim(Games g1)
{
g1.fps();
}
}
class Mainclass2
{
public static void main(String args[])
{
Csgo c1=new Csgo();
Pubg p1=new Pubg();
Cod c2=new Cod();

System.out.println("main starts");
Stimulator.game_sim(c1);
Stimulator.game_sim(p1);
Stimulator.game_sim(c2);
System.out.println("main ends");
}
}