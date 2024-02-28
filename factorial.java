import java.util.Scanner;
public class factorial{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=a.nextInt();
		int Fact=1;
		Fact=fact(n);
		System.out.print("Factorial:"+Fact);
	}
static int fact(int n)
{
	if(n==0)
		return 1;
	else
		return (n*fact(n-1));
}

}
