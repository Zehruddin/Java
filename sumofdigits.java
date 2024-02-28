import java.util.Scanner;
public class sumofdigits{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=a.nextInt();
		int sum=0,digit;
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.print("Sum of digits:"+sum);
	}
}
