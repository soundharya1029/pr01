import java.util.Scanner;

public class id
{
  public static void main(String args[])
  {
	  int c=0,max=0,min=9,a=0,b=1,m=0,l=0,sum1=0,sum2=0,ans=0,x=0,k1=11,k2=11;
	  Scanner sc=new Scanner(System.in);
	  String s1=sc.nextLine();
	  s1=s1.replaceAll("\\D+","");
	  int s=Integer.parseInt(s1);
	  int ch[]=new int[s1.length()];
	  while(s>0)
	  {
		  c=s%10;
		  ch[x]=c;
		  x++;
		  s=s/10;
	  }
	  for(int i=0;i<x;i++)
	  {
		  if(max<=ch[i])
			  max=ch[i];
		  if(min>=ch[i])
			  min=ch[i];
		}
		for(int j=0;j<ch.length;j++)
		{
		  a=a+(max*ch[j]);
		  b=b*(min+ch[j]);
		}
		while(k1>=10)
		{
			sum1=0;
		while(a>0)
		{
			m=a%10;
			sum1=sum1+m;
			a=a/10;
		}
		k1=sum1;
		a=sum1;
		}
		while(k2>=10)
		{
			sum2=0;
		while(b>0)
		{
			l=b%10;
			sum2=sum2+l;
			b=b/10;
		}
		k2=sum2;
		b=sum2;
		}
		if(sum1<=sum2)
			ans=sum1*sum1;
		else if(sum2<sum1)
			ans=sum2*sum2;
		System.out.println(ans);
	  }
  }
