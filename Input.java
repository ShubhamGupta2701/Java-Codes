import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        System.out.println("your age is : "+age);
    }
}
