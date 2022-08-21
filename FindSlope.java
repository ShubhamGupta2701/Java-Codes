import java.util.Scanner;
public class FindSlope {
    public static void main(String[] args) {
        float x,y,x1,x2,y1,y2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Co-ordinates of x1,y1,x2,y2 respectively : ");
        x1 = s.nextFloat();
        x2 = s.nextFloat();
        y1 = s.nextFloat();
        y2 = s.nextFloat();
        x = x2-x1;
        y = y2-y1;
        System.out.println("slope is : "+y/x);
    }
}
