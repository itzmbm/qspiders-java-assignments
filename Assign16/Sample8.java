class Sample8
{
public static void main(String args[])
{
boolean []arr=new boolean[2];
arr[0]=true;
arr[1]=false;
System.out.println("index\tvalues");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}