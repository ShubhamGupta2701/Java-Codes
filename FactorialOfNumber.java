import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int i,n,fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number whose factorial you want to find: ");
        n = s.nextInt();
        for(i=n;i>=1;i--){
            fact *= i;
        }
        System.out.print("Factorial of given number is : "+fact);
    }
}
