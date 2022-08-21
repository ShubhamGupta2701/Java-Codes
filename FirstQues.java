import java.util.Scanner;
public class FirstQues {
    public static void main(String[] args) {
        int b,h;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        b = s.nextInt();
        h = s.nextInt();
        System.out.println("Area is : "+(0.5*b*h));
    }
}
