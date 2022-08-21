import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of principal , rate and time in year respectively : ");
        p = s.nextFloat();
        r = s.nextFloat();
        t = s.nextFloat();
        System.out.println("Simple Interest is : "+(p*r*t)/100);
    }
}
