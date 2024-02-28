import java.util.Scanner;
public class countofdigits{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=a.nextInt();
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.print("count of digits:"+count);
	}
}
