import java.util.Scanner;
class readanddisplayarr
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println("The readed array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}
}