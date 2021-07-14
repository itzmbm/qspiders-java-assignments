class Sample3
{
public static void main(String args[])
{
int []arr=new int[4];
arr[0]=20;
arr[1]=40;
arr[2]=60;
arr[3]=80;
System.out.println("index\tvalues");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}