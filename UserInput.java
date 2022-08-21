import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        int x;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        x = s1.nextInt();
        System.out.println("Enter 2nd number : ");
        int y = s1.nextInt();
        System.out.println("Sum of 2 numbers are : "+(x+y));
    }
}
