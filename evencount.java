import java.util.Scanner;
public class evencount{
    public static void main(String args[]){
        Scanner a =new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=a.nextInt();
        int count=0;
        System.out.println("Even numbers:");
        for(int i=1;i<=n;i++){
            if(i%2==0){
		System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("count:"+count);

    }
}