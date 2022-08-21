import java.util.Scanner;
public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        int i,ad=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number up to where you want to find the sum : ");
        int n = s.nextInt();
        for(i=1;i<=n;i++){
            ad += i;
        }
        System.out.print("Sum of numbers from 1 to n is : "+ad);
    }
}
