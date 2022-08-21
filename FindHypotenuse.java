import java.util.Scanner;

public class FindHypotenuse {
    public static void main(String[] args) {
        double x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = s.nextDouble();
        System.out.println("Enter the value of y: ");
        y = s.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse of the triangle is : "+z);
        s.close();
    }
}
