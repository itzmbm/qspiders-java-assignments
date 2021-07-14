package assign27_vector;

import java.util.Vector;
public class Vector5{
public static void main(String args[])
{
	Vector v1=new Vector();
	v1.add("Bangalore");
	v1.add("Delhi");
	v1.add("Mandya");
	v1.add("Goa");
	v1.add("Qspider");
	System.out.println("***before***\n"+v1);
	v1.remove("Goa");
	System.out.println("***after***\n"+v1);
	v1.remove(0);
	System.out.println("***after***\n"+v1);
}
}
