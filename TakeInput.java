import java.util.Scanner;
public class TakeInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.next();
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("Hi "+name);
        System.out.println("You are "+age+" years old");
        s.close();
    }
}
