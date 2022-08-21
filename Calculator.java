import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int x,y;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        x = S.nextInt();
        y = S.nextInt();
        System.out.print("Enter operation you want to perform : ");
        char operation = S.next().charAt(0);
        switch(operation){
            case '+':
                System.out.print("Sum of numbers are : "+(x+y));
                break;
            case '-':
                System.out.print("Subtraction of numbers are : "+(x-y));
                break;
            case '*':
                System.out.print("Product of numbers are : "+(x*y));
                break;
            case '/':
                System.out.print("Division of numbers are : "+(x/y));
            case '%':
                System.out.print("Modulo of numbers are : "+(x%y));
                break;
            default:
                System.out.print("Please enter an valid Operation.");
        }
    }
}