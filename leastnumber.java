import java.io.*;
import java.lang.*;
import java.util.*;
public class leastnumber
{
  public static void main(String args[])
  {
    int c=0;
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    int n=sc.nextInt();
    int s=Integer.parseInt(s1);
    if(s>0)
    {
    char ch[]=s.toCharArray();
    char ch1[]=new char[s.length()];
    Arrays.sort(ch);
    for(int i=0;i<ch.length-n;i++)
    {
      ch1[c]=ch[i];
      c++;
    }
    String ans=String.valueOf(ch1);
    System.out.println(ans);
    }
    else
      System.out.println("Invalid range");
  }
}
