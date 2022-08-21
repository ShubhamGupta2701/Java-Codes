import java.util.Scanner;
public class AgeFinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Enter your birth year : ");
        i = s.nextInt();
        System.out.println("your age is : "+(2022-i));
    }
}
