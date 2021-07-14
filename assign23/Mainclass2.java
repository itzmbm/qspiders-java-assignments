package assign23;

interface Bank
{
void amt_tranfer();
}
class Sbichennai implements Bank
{
public void amt_tranfer()
{
System.out.println("sbi chennai rs25000");
}
}
class Sbihyderbad implements Bank
{
public void amt_tranfer()
{
System.out.println("sbi hyderbad rs35000");
}
}
class Sbibangalore implements Bank
{
public void amt_tranfer()
{
System.out.println("sbi bangalore rs45000");
}
}
class Stimulator2
{
static void bank_sim(Bank b1)
{
b1.amt_tranfer();
}
}
class Mainclass2
{
public static void main(String args[])
{
Sbichennai s1=new Sbichennai();
Sbihyderbad s2=new Sbihyderbad();
Sbibangalore s3=new Sbibangalore();

System.out.println("main starts");
Stimulator2.bank_sim(s1);
Stimulator2.bank_sim(s2);
Stimulator2.bank_sim(s3);
System.out.println("main ends");
}
}
