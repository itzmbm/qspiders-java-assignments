class Sample5
{
public static void main(String args[])
{
double []arr=new double[4];
arr[0]=10.5;
arr[1]=20.6;
arr[2]=30.7;
arr[3]=40.8;
System.out.println("index\tvalues");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}