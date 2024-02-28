import java.util.Scanner;
public class oddcount{
    public static void main(String args[]){
        Scanner a =new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=a.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("count"+count);

    }
}