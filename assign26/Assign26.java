package assign26;
import java.io.*;
public class Assign26 {
public static void main(String args[]) throws IOException
{
	int count=0;
	int count1=0;
	String replace="";
	File f1=new File("F:\\qspiders.txt");
	FileWriter fw=new FileWriter(f1);
	fw.write("qspiders means java java means qspiders manualtesting means qspiders qspiders means manualtesting");
	fw.flush();
	// writing done
	FileReader fr=new FileReader(f1);
    BufferedReader br=new BufferedReader(fr);
    String s1=br.readLine();
    System.out.println(s1);
    // reading done
    String arr[]=s1.split(" ");
    
    for(int i=0;i<arr.length;i++)
    {
    	String s2=arr[i];
    	for(int j=0;j<s2.length();j++)
    	{
    	char ch=s2.charAt(j);
    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    	{
    		count1++;
    	}
    	}
    	if(arr[i].equals("qspiders"))
    	{
    		count++;
    	}
    }
    System.out.println("qspiders repeated for "+count); 
    System.out.println("Number of vowels in Strings total "+count1);
    s1=s1.replaceAll("qspiders", "jspiders"); // replace 
    FileWriter fww=new FileWriter(f1);
    fww.write(s1);
    fww.flush();
	FileReader frr=new FileReader(f1);
    BufferedReader brr=new BufferedReader(frr);
    s1=brr.readLine();
    System.out.println(s1);   
}
}
