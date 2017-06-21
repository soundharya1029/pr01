import java.util.Scanner;

public class coingame {

	public static void main(String[] args) 
	{
		int sum1=0,sum2=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of coins");
	int n=sc.nextInt();
	int ch[]=new int[n];
	System.out.println("enter coins");
	for(int i=0;i<n;i++)
	{
	   ch[i]=sc.nextInt();	
	}
       for(int j=0;j<ch.length;j+=2)
       {
    	   sum1=sum1+ch[j];
       }
       for(int k=1;k<ch.length;k+=2)
       {
    	   sum2=sum2+ch[k];
       }
       System.out.println("player1 starts the game");
	if(sum1>sum2)
	   System.out.println("player1 wins");
	else if(sum2>sum1)
		System.out.println("player2 wins");
	else if(sum1==sum2)
		System.out.println("Game draw");
	}
}
