import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter temperature : ");
//        int temp = s.nextInt();
//        if(temp > 30){
//            System.out.println("Its hot outside");
//        } else if (temp>=20 && temp <=30) {
//            System.out.println("It's warm outside");
//        }
//        else {
//            System.out.println("It's cold outside");
//        }
        System.out.println("if you want to exit type exit or Exit : ");
        String check = s.next();
//        if(check.equals("exit") || check.equals("Exit")){
//            System.out.println("you are exited.");
//        }
//        else {
//            System.out.println("you are not quited.");
//        }
        if(!check.equals("exit") && !check.equals("Exit") && !check.equals("Yes") && !check.equals("yes")){
            System.out.println("you are not quited.");
        }
        else {
            System.out.println("you are exited.");
        }
        s.close();
    }
}
