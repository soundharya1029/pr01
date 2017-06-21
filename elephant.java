import java.util.*;
public class elephant
{
    public static void main(String args[])
    {
        int sum=0,count=0,i;
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int w=sc.nextInt();
        int ch[]=new int[m];
        for(i=0;i<m;i++)
        {
            ch[i]=sc.nextInt();
        }
        for(int j=m-1;j>=0;j--)
        {
            if(sum<w)
            {
               sum=sum+ch[j];
               count++;
            }
            else if(sum==w)
               break;
            else if(sum>w)
            {
               sum=sum-ch[j+1];
               count--;
            }
        }
        System.out.println(count);
    }
}

