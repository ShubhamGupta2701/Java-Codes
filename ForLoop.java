import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        /*for(int i = 0; i <= 10; i++){
            System.out.print(i+" ");
//            System.out.print(" ");
        */
        //Nesting of loops
        int r,c;
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of rows and columns respectively.");
        r = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Enter a symbol : ");
        s = scanner.next();
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
