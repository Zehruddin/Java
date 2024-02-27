import java.util.Scanner;
public class Secondlastdigit
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=a.nextInt();
		num=num/10;
		num=num%10;
		System.out.println("Last digit of the given number:"+num);
	}
}