import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int i,j,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n = s.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
