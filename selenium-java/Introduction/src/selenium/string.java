package selenium;

public class string {

	public static void main(String[] args) {
	 String s = "Rahul Revanth Nizambad";
	String[] Splitedstring=s.split(" ");
	System.out.println(Splitedstring[0]);
	System.out.println(Splitedstring[1]);
	System.out.println(Splitedstring[2]);
	for(int i=0;i<s.length();i++)
	{
	  System.out.println(s.charAt(i));
	}
// Reverse string 
	
	for(int i=s.length()-1;i>=0;i--)
	{
		 System.out.println(s.charAt(i));
	}
	
	}

}
