package assign27_vector;

import java.util.ArrayList;
import java.util.Vector;
public class Vector7 {
public static void main(String args[])
{
   Vector v1=new Vector();
	v1.add(10);
	v1.add(20);
	v1.add(30);
	v1.add(40);
	Vector v2=new Vector();
	v2.add(30);
	v2.add(40);
	v2.add(100);
	v2.add(200);
	System.out.println("***before***");
	System.out.println("***v1***\n"+v1);
	System.out.println("***v2***\n"+v2);
	v1.removeAll(v2);
	System.out.println("***after***");
	System.out.println("***v1***\n"+v1);
	System.out.println("***v2***\n"+v2);
}
}
