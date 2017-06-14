import java.io.*;
import java.lang.*;
import java.util.*;
public class leastnumber
{
  public static void main(String args[])
  {
    int c=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.nextLine();
    char ch[]=s.toCharArray();
    Arrays.sort(ch);
    for(int i=0;i<ch.length-n;i++)
    {
      ch1[c]=ch[i];
      c++;
    }
    String ans=String.valueOf(ch1);
    System.out.println(ans);
  }
}
