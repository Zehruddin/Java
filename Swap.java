import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=obj.nextInt();
		System.out.println("Enter b");
		int b=obj.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:");
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}