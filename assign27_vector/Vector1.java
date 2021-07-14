package assign27_vector;

import java.util.Vector;

public class Vector1 {
	public static void main(String args[])
	{
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20.56d);
		v1.add('A');
		v1.add("hello");
		v1.add(10);
		v1.add(null);
		System.out.println(v1);
	}
}
