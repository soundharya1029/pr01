import java.util.Scanner;

public class chococut {

	public static void main(String[] args)
	{
		int cut=0;
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	if(m!=0 && n!=0)
	{
		cut=(m*n)-1;
		System.out.println(cut);
	}
	else
		System.out.println("Invalid size chocolate");
	}

}
