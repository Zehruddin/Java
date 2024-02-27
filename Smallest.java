import java.util.Scanner;
public class Smallest
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
		if(a<=b && a<=c)
			System.out.println("a is Smallest");
		else if(b<=a && b<=c)
			System.out.println("b is Smallest");
		else
			System.out.println("c is Smallest");
	}
}
