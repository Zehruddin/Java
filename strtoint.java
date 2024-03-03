import java.util.Scanner;
class strtoint
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number in String:");
		String n=s1.next();
		System.out.println("Adding 100 to converted integer:"+(Integer.valueOf(n)+100));

	}
}