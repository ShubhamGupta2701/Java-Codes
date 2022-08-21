import java.util.Scanner;
public class SecondQues {
    public static void main(String[] args) {
        float r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere : ");
        r = s.nextFloat();
        System.out.println("Volume of the sphere is : "+((float)4/3*3.1416*(r*r*r)));
    }
}

