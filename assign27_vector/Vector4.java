package assign27_vector;

import java.util.Vector;
public class Vector4 {
public static void main(String args[])
{
	Vector v1=new Vector();
	v1.add(10);
	v1.add(20);
	v1.add(30);
	v1.add(40);
	Vector v2=new Vector();
	v2.add('A');
	v2.add('B');
	v2.add('C');
	v1.addAll(1,v2);
	System.out.println("***v1***\n"+v1);
	System.out.println("***v2***\n"+v2);
}
}
