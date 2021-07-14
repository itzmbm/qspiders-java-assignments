class Sample2
{
public static void main(String args[])
{
short []arr=new short[4];
arr[0]=10;
arr[1]=30;
arr[2]=50;
arr[3]=70;
System.out.println("index\tvalues");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}