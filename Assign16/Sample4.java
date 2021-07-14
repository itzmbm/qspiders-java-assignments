class Sample4
{
public static void main(String args[])
{
long []arr=new long[4];
arr[0]=25;
arr[1]=50;
arr[2]=75;
arr[3]=100;
System.out.println("index\tvalues");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}