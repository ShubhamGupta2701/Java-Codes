import java.util.Scanner;
public class UserInputForLoop {
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Number is at index : "+i);
        }
    }
}
