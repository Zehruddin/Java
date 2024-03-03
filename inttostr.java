import java.util.Scanner;
class inttostr
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number in integer:");
		int n=s1.nextInt();
		System.out.println("Adding 100 to converted string:"+(String.valueOf(n)+100));

	}
}