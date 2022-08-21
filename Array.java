import java.util.Scanner;
public class Array {
    /* public static void main(String[] args) {
        String[] name = {"shubham","karan","triom","Aastha","Nora"}; // for this ,we didn't need to import
        System.out.print(name[4]);
    } */
    public static void main(String[] args) {
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.print("Array Elements are : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
