import java.util.Scanner;
public class ThirdQues {
    public static void main(String[] args) {
        float f,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in celsius : ");
        c = s.nextFloat();
//        System.out.print("Enter temperature in Fahrenheit : ");
        f = ((c*(float)9/5)+32);
        System.out.println("Temperature convert celsius into Fahrenheit : "+f);
        System.out.println("Temperature convert Fahrenheit into Celsius : "+((f-32)*(float)5/9));

    }
}
