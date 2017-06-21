import java.util.Scanner;

public class pangram {

	public static void main(String[] args)
	{
		int count=0;
	   Scanner sc=new Scanner(System.in);
	   String str=sc.nextLine();
	   String st=str.replaceAll("\\s","").toLowerCase();
	   for(char i='a';i<='z';i++)
	   {
		   for(int j=0;j<st.length();j++)
		   {
			 if(st.charAt(j)==i)
			 {
				 count++;
				 st=st.replaceAll(String.valueOf(i),"");
			 }
			 
		   }
		   
	   }
	   if(count==26)
		   System.out.println("Pangram");
	   else
		   System.out.println("Not a Pangram");
	}

}
