import java.util.Scanner;
public class testScore {
    public static void main(String[] args) {
        int score;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter test score of student : ");
        score = s.nextInt();
        if(score >= 75){
            System.out.println("Very Good");
        }
    }
}
