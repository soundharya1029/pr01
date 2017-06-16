import java.util.*;
import java.lang.*;
public class longpal
{
    public static void main(String args[])
    {
        int i,j,c=0,k,flag=0;
        String pal="";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        String ans[]=new String[50];
        for(i=0;i<ch.length;i++)
        {
            for(j=ch.length-1;j>=0;j--)
            {
                if(i<j)
                {
                if(ch[i]==ch[j])
                {
                    String str=s.substring(i,j+1);
                    StringBuffer sb=new StringBuffer(str);
                    String str2=sb.reverse().toString();
                    if(str2.equals(str))
                    { 
                      ans[c]=str;
                      c++;
                        flag=1;
                    }
                }
                } 
            }
        }
       int mlen=ans[0].length();
       for(k=1;k<c;k++)
       {
           int clen=ans[k].length();
           if(clen>=mlen)
           {
               mlen=clen;
               pal=ans[k];
           }
       }
       System.out.println(pal);
        if(flag=0)
            System.out.println("Invalid");
    }
}
