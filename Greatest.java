import java.util.Scanner;
public class Greatest
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=ob.nextInt();
		System.out.println("Enter b:");
		int b=ob.nextInt();
		System.out.println("Enter c:");
		int c=ob.nextInt();
		if(a>=b && a>=c)
			System.out.println("a is greatest");
		else if(b>=a && b>=c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
	}
}
