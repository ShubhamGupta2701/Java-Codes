import java.util.Scanner;
class check{
    static void say_hi(){   //i can use these functions under my main class then i didn't have to use classname.
        System.out.println("hello my name is shubham. ");
    }
    static int addition(int x,int y){
        return x+y;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        check.say_hi();
        System.out.print("Enter two numbers : ");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Addition of two numbers : "+check.addition(a,b));
    }
}
