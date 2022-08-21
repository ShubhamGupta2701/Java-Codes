import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        if(age >= 18){
            System.out.println("You are an adult");
        } else if (age < 18 && age>=14) {
            System.out.println("You are a teen");
        }
        else{
            System.out.println("You are just a fucking child");
        }
        s.close();
    }
}
