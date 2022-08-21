import java.util.Scanner;
public class SwitchCases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which day is is ?");
        String day = s.next();
        switch (day){
            case "sunday":
                System.out.println("Tomorrow is monday");
                break;
            case "monday":
                System.out.println("Tomorrow is tuesday");
                break;
            case "tuesday":
                System.out.println("Tomorrow is wednesday");
                break;
            case "wednesday":
                System.out.println("Tomorrow is thursday");
                break;
            case "thursday":
                System.out.println("Tomorrow is friday");
                break;
            case "friday":
                System.out.println("Tomorrow is saturday");
                break;
            case "saturday":
                System.out.println("Tomorrow is sunday");
                break;
            default:
                System.out.println("enter a valid day");
        }
        s.close();
    }
}
