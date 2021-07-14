package assign24;

class Whatsapp 
{
	 private int passcode=433776;
	 public int getPasscode()
	 {
		 return passcode;
	 }
	 public void setPasscode(int a)
	 {
		 passcode=a;
	 }
	}
	 class Mainclass
	 {
		 public static void main(String args[])
		 {
		 Whatsapp w=new Whatsapp();
		 int b=w.getPasscode();
	     System.out.println(b);
	     w.setPasscode(123456);
	     System.out.println(w.getPasscode());
	     
	 }
	}
