import java.util.Scanner;
public class factors
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=a.nextInt();
			System.out.println("Factors:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
}