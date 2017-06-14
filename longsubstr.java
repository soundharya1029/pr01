import java.util.*;
import java.lang.*;
public class leastsubstr
{
 public static void main(String args[])
{
int i,j,n=0,sal=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=s;
char ch[]=s1.toCharArray();
char ch1[]=new char[s.length()];
String sa="";
for(i=0;i<s.length();i++)
{
for(j=i+1;j<s.length();j++)
{
if(ch[i]!=ch[j])
{
 for(int k=0;k<j;k++)
 {if(ch1[k]=!ch[j])
 {
 ch1[n]=ch[i];
 ch1[j]=ch[j];
 }
 }
}
else if(ch1.length>sal)
sa=String.valueOf(ch1);
sal=sa.length();
}
}
System.out.println(sa);	
sc.close();
}
}
